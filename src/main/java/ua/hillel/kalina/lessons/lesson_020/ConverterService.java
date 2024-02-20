package ua.hillel.kalina.lessons.lesson_020;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.yaml.snakeyaml.Yaml;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConverterService {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    private static final Yaml yaml = new Yaml();


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
        try (FileInputStream inputStream = new FileInputStream(jsonFile);
             FileWriter writer = new FileWriter(yamlFile)) {
            JsonNode jsonNode = objectMapper.readTree(inputStream);

            if (jsonNode.isArray()) {
                Iterator<JsonNode> iterator = jsonNode.elements();
                while (iterator.hasNext()) {
                    JsonNode element = iterator.next();
                    String yamlString = objectMapper.writeValueAsString(element);
                    writer.write("- " + yamlString + "\n");
                }
            } else {
                String yamlString = objectMapper.writeValueAsString(jsonNode);
                writer.write("- " + yamlString + "\n");
            }
        }
    }

    private static void convertYamlToJson(File yamlFile, File jsonFile) throws IOException {
        List<Object> yamlObjects = readYamlObjects(yamlFile);
        List<String> jsonObjects = new ArrayList<>();

        for (Object yamlObj : yamlObjects) {
            String jsonObject = objectMapper.writeValueAsString(yamlObj);
            jsonObjects.add(jsonObject);
        }

        try (PrintWriter writer = new PrintWriter(jsonFile)) {
            writer.println("[");
            for (int i = 0; i < jsonObjects.size(); i++) {
                writer.print(jsonObjects.get(i));
                if (i < jsonObjects.size() - 1) {
                    writer.println(",");
                }
            }
            writer.println("\n]");
        }
    }

    private static List<Object> readYamlObjects(File yamlFile) throws IOException {
        List<Object> objects = new ArrayList<>();
        try (InputStream inputStream = new FileInputStream(yamlFile)) {
            Iterable<Object> yamlDocuments = yaml.loadAll(inputStream);
            for (Object document : yamlDocuments) {
                if (document instanceof Iterable) {
                    Iterator<?> iterator = ((Iterable<?>) document).iterator();
                    while (iterator.hasNext()) {
                        objects.add(iterator.next());
                    }
                } else {
                    objects.add(document);
                }
            }
        }
        return objects;
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