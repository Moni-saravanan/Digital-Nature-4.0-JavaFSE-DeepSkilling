package com.example.slf4jloggingdemo.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderLogging {
    private static final Logger logger = LoggerFactory.getLogger(AppenderLogging.class);

    public static void main(String[] args) {
        logger.info("This message should appear on both console and file.");
        logger.error("This is a critical error message");
        logger.warn("This is just a warning logged to both appenders");
    }
}
