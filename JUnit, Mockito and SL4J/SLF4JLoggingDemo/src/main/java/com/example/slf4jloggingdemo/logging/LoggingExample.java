package com.example.slf4jloggingdemo.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.error("this is an error message");
        logger.warn("this is an warning message");
    }
}
