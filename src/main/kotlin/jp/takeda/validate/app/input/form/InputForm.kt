package jp.takeda.validate.app.input.form

import org.hibernate.validator.constraints.NotBlank
import javax.validation.Valid

class InputForm {
    @NotBlank
    var name: String = ""
    @Valid
    var detail: DetailInputForm = DetailInputForm()
}