package PracticeProblems.LoggingSystem;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoggerFactory {
    private static final LoggerFactory INSTANCE = new LoggerFactory();
    private final Map<String, Logger> loggers = new ConcurrentHashMap<>();

    private LoggerFactory() {}

    public static LoggerFactory getInstance() {
        return INSTANCE;
    }

    public Logger getLogger(String name) {
        return loggers.computeIfAbsent(name, n -> {
            Logger newLogger = new Logger(n);
            newLogger.setLevel(LogLevel.INFO);
            newLogger.setFormatter(new TimestampFormatter());
            newLogger.addAppender(new ConsoleAppender());
            return newLogger;
        });
    }
}
