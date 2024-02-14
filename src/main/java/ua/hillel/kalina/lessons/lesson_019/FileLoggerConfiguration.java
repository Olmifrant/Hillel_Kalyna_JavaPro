package ua.hillel.kalina.lessons.lesson_019;

import lombok.Getter;
import java.io.File;

@Getter
public class FileLoggerConfiguration {

    private final File logFile;
    private final LoggingLevel currentLogLevel;
    private final long maxFileSize;
    private final String logFormat;

    public FileLoggerConfiguration(File logFile, LoggingLevel currentLogLevel, long maxFileSize, String logFormat) {

        this.logFile = logFile;
        this.currentLogLevel = currentLogLevel;
        this.maxFileSize = maxFileSize;
        this.logFormat = logFormat;
    }
}
