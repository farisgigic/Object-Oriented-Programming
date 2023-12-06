package Week7;
@FunctionalInterface
interface Logger {
    void logMessage(String message);
}

record RecordLogger(String loggerName) implements Logger {
    public void logMessage(String message) {
        System.out.println(loggerName + ": " + message);
    }
}
class ClassLogger implements Logger {
    private String loggerName;

    public ClassLogger(String loggerName) {
        this.loggerName = loggerName;
    }

    public String getLoggerName() {
        return loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }

    public void logMessage(String message) {
        System.out.println(this.loggerName + ": " + message);
    }
}
class First {
    RecordLogger recordLogger = new RecordLogger("Record logger");
    ClassLogger classLogger  = new ClassLogger("Class logger");

    Logger recordLog = (String message1) -> {
        recordLogger.logMessage(message1);
    };
    Logger classLog = (String message) -> {
        classLogger.logMessage(message);
    };

}
