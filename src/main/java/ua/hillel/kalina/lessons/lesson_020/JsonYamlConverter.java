package ua.hillel.kalina.lessons.lesson_020;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.yaml.snakeyaml.Yaml;
import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.*;
import java.security.CodeSource;

public class JsonYamlConverter {

    private static final ObjectMapper jsonMapper = new ObjectMapper();
    private static final Yaml yaml = new Yaml();

    public static void main(String[] args) throws URISyntaxException {

        CodeSource codeSource = ua.hillel.kalina.lessons.lesson_020.JsonYamlConverter.class.getProtectionDomain().getCodeSource();
        File jarFile = new File(codeSource.getLocation().toURI().getPath());
        String jarDir = jarFile.getParentFile().getPath();

        String[] str = args;

        String path;
        if (str.length == 0){
            path = jarDir;
            //path = "src/main/java/ua/hillel/kalina/lessons/lesson_021/resourse";
        }else {
            path = String.valueOf(str[0]);
        }

        convertFiles(path, path + "/Converted");
    }

    public static void convertFiles(String inputDir, String outputDir) {
        try {
            Files.createDirectories(Paths.get(outputDir));

            Files.list(Paths.get(inputDir))
                    .filter(Files::isRegularFile)
                    .forEach(file -> {
                        try {
                            String fileName = file.getFileName().toString();
                            String extension = getFileExtension(fileName);
                            String newFileName = fileName.substring(0, fileName.lastIndexOf('.')) +
                                    (extension.equals("json") ? ".yaml" : ".json");

                            long startTime = System.currentTimeMillis();

                            if (extension.equals("json")) {
                                convertJsonToYaml(file.toFile(), new File(outputDir + "/" + newFileName));
                            } else if (extension.equals("yaml")) {
                                convertYamlToJson(file.toFile(), new File(outputDir + "/" + newFileName));
                            } else {
                                System.out.println(fileName + " -> не поддерживаемый формат");
                                return;
                            }

                            long endTime = System.currentTimeMillis();

                            long oldSize = Files.size(file);
                            long newSize = Files.size(Paths.get(outputDir + "/" + newFileName));

                            System.out.println(fileName + " -> " + newFileName + ", " +
                                    "длительность конвертации: " + (endTime - startTime) + " мс, " +
                                    "старый размер: " + oldSize + " байт -> новый размер: " + newSize + " байт");

                            logConversion(fileName, newFileName, endTime - startTime, oldSize, newSize, outputDir);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void convertJsonToYaml(File jsonFile, File yamlFile) throws IOException {
        Object json = jsonMapper.readValue(jsonFile, Object.class);
        try (Writer writer = new FileWriter(yamlFile)) {
            yaml.dump(json, writer);
        }
    }

    private static void convertYamlToJson(File yamlFile, File jsonFile) throws IOException {
        try (InputStream inputStream = new FileInputStream(yamlFile);
             OutputStream outputStream = new FileOutputStream(jsonFile)) {
            Iterable<Object> yamlObjects = yaml.loadAll(inputStream);
            jsonMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
            for (Object yamlObject : yamlObjects) {
                String jsonString = jsonMapper.writeValueAsString(yamlObject);
                outputStream.write(jsonString.getBytes());
                outputStream.write('\n');
            }
        }
    }

    private static String getFileExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf('.') + 1);
    }

    private static void logConversion(String oldFileName, String newFileName, long duration, long oldSize, long newSize, String path) {
        String logMessage = oldFileName + " -> " + newFileName + ", " +
                "длительность конвертации: " + duration + " мс, " +
                "старый размер: " + oldSize + " байт -> новый размер: " + newSize + " байт";

        try (PrintWriter writer = new PrintWriter(new FileWriter(path + "/result.log", true))) {
            writer.println(logMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}