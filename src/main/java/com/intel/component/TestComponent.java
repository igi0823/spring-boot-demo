package com.intel.component;

import org.springframework.stereotype.Component;

@Component
public class TestComponent implements TestInterface {

    public TestComponent(){
        System.out.println("i am Component constructor");
    }

    public void sayHello(){
        System.out.println("i am Component");
    }
}
