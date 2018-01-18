package jp.takeda.validate.app.input.validator;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class EqualsValidator implements ConstraintValidator<Equals, Object> {

    private String param1Field;
    private String param2Field;
    private String message;

    @Override
    public void initialize(Equals constraintAnnotation) {
        this.param1Field = constraintAnnotation.param1();
        this.param2Field = constraintAnnotation.param2();
        this.message = constraintAnnotation.message();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        BeanWrapper beanWrapper = new BeanWrapperImpl(value);

        String param1 = (String)beanWrapper.getPropertyValue(this.param1Field);
        String param2 = (String)beanWrapper.getPropertyValue(this.param2Field);

        context.disableDefaultConstraintViolation();
        context.buildConstraintViolationWithTemplate(message)
                .addPropertyNode(this.param2Field)
                .addConstraintViolation();

        return Objects.equals(param1, param2);
    }
}
