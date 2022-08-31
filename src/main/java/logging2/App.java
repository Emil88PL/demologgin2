package logging2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public final class App {
    
    

    public static Logger logger = LogManager.getLogger();
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
            logger.trace("We've just greeted the user!");
            logger.debug("We've just greeted the user!");
            logger.info("We've just greeted the user!");
            logger.warn("We've just greeted the user!");
            logger.error("We've just greeted the user!");
            logger.fatal("We've just greeted the user! with Fatal error");
            
        }
    


}
