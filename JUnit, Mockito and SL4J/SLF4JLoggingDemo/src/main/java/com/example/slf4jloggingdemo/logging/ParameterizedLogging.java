package com.example.slf4jloggingdemo.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {
        String user = "Monika";
        int attempts = 5;

        logger.info("User {} has attempted {} logins unsuccessfully", user, attempts);
        logger.debug("Debug log for user: {}", user);
    }
}
