package jp.takeda.validate.app.input.form

import jp.takeda.validate.app.input.validator.Equals
import org.hibernate.validator.constraints.NotBlank
import javax.validation.Valid

@Equals(param1 = "email1", param2 = "email2")
class InputForm {
    @NotBlank
    var name: String = ""
    @NotBlank(message="{E0001}")
    var age: String = ""

    var email1: String = ""
    var email2: String = ""

    @Valid
    var detail: DetailInputForm = DetailInputForm()
}