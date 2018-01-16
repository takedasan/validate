package jp.takeda.validate.app.input.form

import org.hibernate.validator.constraints.NotBlank
import javax.validation.Valid

class InputForm {
    @NotBlank
    var name: String = ""
    @NotBlank(message="{E0001}")
    var age: String = ""
    @Valid
    var detail: DetailInputForm = DetailInputForm()
}