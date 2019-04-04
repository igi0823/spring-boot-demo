package com.intel.component;


import org.springframework.stereotype.Component;

@Component
public class TestBean implements TestInterface {

    private String name;
    private Integer age;

    public TestBean(){
        System.out.println("i am TestBean constructor");
    }

    public void sayHello(){
        System.out.println("i am TestBean");
    }
}
