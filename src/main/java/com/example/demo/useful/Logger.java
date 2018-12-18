package com.example.demo.useful;

import com.example.demo.DemoApplication;
import org.slf4j.LoggerFactory;

public class Logger {
    private static org.slf4j.Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void log(String string){
        logger.info(string);
    }
}
