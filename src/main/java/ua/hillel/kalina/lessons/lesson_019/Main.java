package ua.hillel.kalina.lessons.lesson_019;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File logFile = new File("src/main/java/ua/hillel/kalina/lessons/lesson_019/logFile.txt");

            int var = (int) (Math.random() * 2 + 1);
            LoggingLevel currentLogLevel = switch (var) {
                case 1 -> LoggingLevel.INFO;
                case 2 -> LoggingLevel.DEBUG;
                default -> throw new IllegalStateException("Unexpected value: " + var);
            };

            long maxFileSize = 1024;
            String logFormat = "%s";

            FileLoggerConfiguration configuration = new FileLoggerConfiguration(logFile, currentLogLevel, maxFileSize, logFormat);
            FileLogger logger = new FileLogger(configuration);

            logger.info("Info Message.");
            logger.debug("Debug message.");

    }
}
