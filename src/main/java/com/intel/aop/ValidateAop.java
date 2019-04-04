package com.intel.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidateAop {

    public ValidateAop(){

    }

//    @Pointcut(value = "execution(*com.intel.service.ValidateService.*(..))")
    public void pointCut(){

    }
}
