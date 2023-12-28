package Week_13.FirstTask;

public class Logger {
    private static Logger instance;

    private Logger(){}

    public static Logger getInstance() {
        synchronized (Logger.class){
            if(instance == null){
                instance =  new Logger();
            }
        }
        return instance;
    }
    public void log(String message){
        System.out.println("Log " + message);
    }
    public void logInfo(String message){
        System.out.println("Info: " + message);
    }
    public void logWarning(String message){
        System.out.println("WARNING! " + message);
    }
    public void logError(String message){
        System.out.println("ERROR! " +message);
    }
}
class MainSingleton
{
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Welcome");
        logger.logInfo("Faris");
        logger.logWarning("New warning !");
        logger.logError("New error !");
    }
}