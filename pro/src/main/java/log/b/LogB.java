package log.b;

import org.apache.log4j.Logger;

public class LogB {

    private static final Logger logger = Logger.getLogger(LogB.class);
    
    public LogB() {
        logger.debug("logB.........debug................................");
        logger.info("logB.........info................................");
        logger.warn("logB.........warn................................");
        logger.error("logB..error.......................................");
    }
}
