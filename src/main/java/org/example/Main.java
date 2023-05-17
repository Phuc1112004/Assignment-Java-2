package org.example;

import org.apache.log4j.Logger;

public class Main {
    private final static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        logInfoString("User login in");
        logWarningString("Connect DB timeout");
    }

    private  static  void logInfoString(String message) {
        logger.info("This is info : " + message);
    }
    private static void logWarningString(String message) {
        logger.warn("This is warn : " + message);

    }
}