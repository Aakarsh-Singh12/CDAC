
public class Logger {
    private static Logger loggerInstance; 
    private StringBuilder logMessages; 
    
    
    private Logger() {
        logMessages = new StringBuilder();
    }

    
    public static Logger getInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Logger(); 
        }
        return loggerInstance;
    }

    public void log(String message) {
        logMessages.append(message).append("\n");
    }

    public String getLog() {
        return logMessages.toString();
    }

    public void clearLog() {
        logMessages.setLength(0);
    }
}

