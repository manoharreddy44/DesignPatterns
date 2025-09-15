package PracticeProblems.LoggingSystem;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Logger {
    private final String name;
    private volatile LogLevel level;
    private volatile Formatter formatter;
    private final List<Appender> appenders;

    public Logger(String name) {
        this.name = name;
        this.appenders = new CopyOnWriteArrayList<>();
    }

    public void setLevel(LogLevel level) {
        this.level = level;
    }

    public void setFormatter(Formatter formatter) {
        this.formatter = formatter;
    }

    public void addAppender(Appender appender) {
        this.appenders.add(appender);
    }

    public void debug(String message) {
        log(LogLevel.DEBUG, message);
    }

    public void info(String message) {
        log(LogLevel.INFO, message);
    }

    public void warn(String message) {
        log(LogLevel.WARN, message);
    }

    public void error(String message) {
        log(LogLevel.ERROR, message);
    }

    private void log(LogLevel messageLevel, String message) {
        if (this.level == null || this.formatter == null) {
            return;
        }
        if (messageLevel.ordinal() >= this.level.ordinal()) {
            LogEvent event = new LogEvent(messageLevel, message, this.name);
            String formattedMessage = formatter.format(event);
            for (Appender appender : appenders) {
                appender.append(formattedMessage);
            }
        }
    }
}
