package com.intel.exception;

import java.lang.String;

public class MyException extends Exception {

    public MyException(){

    }


    public MyException(String message){
           super(message);
       }
}
