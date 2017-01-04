package com.mfe.test;

import com.mfe.test.util1.Echo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.mfe.test.util1.Echo.sayHello;

/**
 * Created by minichen on 2017/1/4.
 */
public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);
    static public void main(String[] argv){
        //PropertyConfigurator.configure("/Users/minichen/log4j.properties");
        //System.setProperty("log4j.configurationFile", "/Users/minichen/log4j2.xml");
        logger.debug("debug");
        logger.error("error");

        logger.debug(Echo.sayHello());
    }
}
