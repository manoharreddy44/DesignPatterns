package PracticeProblems.LoggingSystem;

import java.time.Instant;

public class LogEvent {
    public final Instant timestamp;
    public final LogLevel level;
    public final String message;
    public final String loggerName;

    public LogEvent(LogLevel level, String message, String loggerName) {
        this.timestamp = Instant.now();
        this.level = level;
        this.message = message;
        this.loggerName = loggerName;
    }
}

