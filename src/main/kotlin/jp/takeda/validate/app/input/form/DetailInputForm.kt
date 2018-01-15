package jp.takeda.validate.app.input.form

import org.hibernate.validator.constraints.NotBlank

data class DetailInputForm(

        @NotBlank
        var name: String = ""
)