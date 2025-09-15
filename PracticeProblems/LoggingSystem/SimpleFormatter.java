package PracticeProblems.LoggingSystem;

public class SimpleFormatter implements Formatter {
    @Override
    public String format(LogEvent event) {
        return "[" + event.level + "] " + "- " + event.message;
    }
}
