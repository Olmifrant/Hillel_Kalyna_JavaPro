package ua.hillel.kalina.lessons.lesson_019;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger {

    private final FileLoggerConfiguration configuration;

    public FileLogger(FileLoggerConfiguration configuration) {
        this.configuration = configuration;
    }

    private void writeToFile (String message) throws IOException, FileMaxSizeReachedException {

        File logFile = configuration.getLogFile();

        if (!logFile.exists()) {
            logFile.createNewFile();
        }

        if (logFile.length() >= configuration.getMaxFileSize()) {
            throw new FileMaxSizeReachedException("Максисальный размер лога: " + configuration.getMaxFileSize() + " байт. Текущий размер лога: " + logFile.length() + " байт. Path: " + logFile.getAbsolutePath());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            writer.write(message);
            writer.newLine();
        }
    }

    public void debug (String message) {
        if (configuration.getCurrentLogLevel() == LoggingLevel.DEBUG) {
            writeLog("[DEBUG] " + message);

        }
    }

    public void info (String message) {
        if (configuration.getCurrentLogLevel() == LoggingLevel.DEBUG || configuration.getCurrentLogLevel() == LoggingLevel.INFO) {
            writeLog("[INFO] " + message);
        }
    }

    private void writeLog (String message) {
        String formattedMessage = "[" + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + "] " + message;
        try {
            writeToFile(formattedMessage);
        } catch (IOException | FileMaxSizeReachedException e) {
            e.printStackTrace();
        }
    }

}
