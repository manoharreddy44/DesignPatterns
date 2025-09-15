package PracticeProblems.LoggingSystem;

public class ConsoleAppender implements Appender {
    @Override
    public void append(String formattedMessage) {
        System.out.println(formattedMessage);
    }
}