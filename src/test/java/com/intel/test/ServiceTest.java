package com.intel.test;


import com.intel.service.TestService;
import org.junit.Assert;
import org.junit.Test;


public class ServiceTest {

    @Test
    public void test(){
        TestService testService = new TestService();
        testService.method();
        String hello = "message";
        Assert.assertTrue(false);
        Assert.assertEquals("message",hello);
    }

}
