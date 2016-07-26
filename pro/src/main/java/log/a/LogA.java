package log.a;

import org.apache.log4j.Logger;

public class LogA {

    private static final Logger logger = Logger.getLogger(LogA.class);
    
    public LogA() {
        logger.debug("logA......................debug...................");
        logger.info("logA......................info...................");
        logger.warn("logA......................warn...................");
        logger.error("logA......................error...................");
    }
}
