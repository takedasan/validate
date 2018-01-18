package jp.takeda.validate.app.input.validator;

import jp.takeda.validate.app.input.form.InputForm;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {EqualsValidator.class})
@Target({TYPE, ANNOTATION_TYPE})
@Retention(RUNTIME)
public @interface Equals {

    String message() default "{jp.takeda.validate.app.input.validator,Equals.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String param1();
    String param2();

    @Target({TYPE, ANNOTATION_TYPE})
    @Retention(RUNTIME)
    @Documented
    public static @interface List {
        Equals[] value();
    }
}