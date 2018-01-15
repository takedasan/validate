package jp.takeda.validate.app.input

import jp.takeda.validate.app.input.form.InputForm
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping("input")
class InputController {

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun doGet(model: Model): String {
        var inputForm: InputForm = InputForm()
        model.addAttribute("inputForm", inputForm)

        return "input/form";
    }

    @RequestMapping(method = arrayOf(RequestMethod.POST))
    fun doPost(@Validated inputForm: InputForm, bindingResult: BindingResult, model: Model): String {

        return "input/form";
    }
}