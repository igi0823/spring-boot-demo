package com.intel.contrller;

import java.lang.Exception;

import com.intel.exception.MyException;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.intel.exception.MyException;



@Controller
public class LogController {
    private final Logger logger = LoggerFactory.getLogger(LogController.class);

    public void testSentry(Integer num){

            int i = num/0;
            logger.error("error");
            logger.warn("warn");

        }

}
