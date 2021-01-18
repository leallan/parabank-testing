package com.parabank.app.Utilities;

import java.util.logging.Logger;

public class MyLogger {
    private static Logger logger = Logger.getAnonymousLogger();

    public static final void severe(String message) {
        logger.severe(message);
    }

    public static final void warning(String message) {
        logger.warning(message);
    }

    public static final void info(String message) {
        logger.info(message);
    }

    public static final void config(String message) {
        logger.config(message);
    }
}
