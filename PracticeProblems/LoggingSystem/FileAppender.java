package PracticeProblems.LoggingSystem;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppender implements Appender {
    private final String filePath;

    public FileAppender(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void append(String formattedMessage) {
        try (FileWriter writer = new FileWriter(this.filePath, true)) {
            writer.write(formattedMessage + System.lineSeparator());
        } catch (IOException e) {
            System.err.println("Failed to write to log file: " + e.getMessage());
        }
    }
}
