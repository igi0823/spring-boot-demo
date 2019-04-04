package com.intel.service;

import com.intel.form.BaseForm;
import org.springframework.stereotype.*;
import javax.validation.ValidatorFactory;
import javax.validation.Validator;
import javax.validation.Validation;
import javax.validation.ConstraintViolation;

import java.util.Set;


@Service
public class ValidateService {

    private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    public void validateForm(BaseForm form){
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<BaseForm>> violations = validator.validate(form);
        for(ConstraintViolation<BaseForm> violation:violations){
            System.out.println(String.format("error message %s",violation.getMessage()));
        }
    }
}
