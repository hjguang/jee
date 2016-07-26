package log;

import org.apache.log4j.Logger;

import log.a.LogA;
import log.b.LogB;

public class LogMain {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogMain.class);
//        
//        logger.debug("debug");
//        logger.info("info");
//        logger.warn("warn");
//        logger.error("error");
        
        new LogA();
        new LogB();
    }

}
