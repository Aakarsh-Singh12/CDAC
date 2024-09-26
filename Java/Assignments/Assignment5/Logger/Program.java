
public class Program {
	
	
    public static void main(String[] args) {
        
    	
        Logger logger = Logger.getInstance();

        logger.log("First log message.");
        logger.log("Second log message.");
        
        
        System.out.println("Log Messages:");
        System.out.println(logger.getLog());

        logger.clearLog();

        System.out.println("Log Messages after clearing:");
        System.out.println(logger.getLog());
    }
}
