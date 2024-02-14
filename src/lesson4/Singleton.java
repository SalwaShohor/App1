package lesson4;
import java.text.SimpleDateFormat;
import java.util.Date;

// Singleton Logger class
class Logger {
    private static Logger instance = null;

    // Private constructor to prevent direct instantiation
    private Logger() {}

    // Public method to get the singleton instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Public method to log a message with timestamp
    public void log(String message) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestamp = dateFormat.format(new Date());
        System.out.println("[" + timestamp + "] " + message);
    }
}


public class Singleton {

    public static void main(String[] args) {
        // Obtain the singleton instance of Logger
        Logger logger = Logger.getInstance();

        // Log a message using the Logger instance
        logger.log("Logging a message using the Singleton Logger.");
    }

}
