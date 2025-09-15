package PracticeProblems.LoggingSystem;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimestampFormatter implements Formatter {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                                                                    .withZone(ZoneId.systemDefault());
    @Override
    public String format(LogEvent event) {
        return formatter.format(event.timestamp) + 
               " [" + event.level + "]" +
               " [" + event.loggerName + "] " + 
               "- " + event.message;
    }
}
