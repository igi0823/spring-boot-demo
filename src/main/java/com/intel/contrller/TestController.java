package com.intel.contrller;

import com.intel.form.TestForm;
import com.intel.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    public void controller(@Valid TestForm testForm, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            String msg = bindingResult.getFieldError().getDefaultMessage();
            System.out.println(String.format("表单验证错误：%s",msg));
        }
//        testService.method();
    }

}
