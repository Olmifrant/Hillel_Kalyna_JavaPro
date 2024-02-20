package ua.hillel.kalina.lessons.lesson_020;

import java.io.File;
import java.net.URISyntaxException;
import java.security.CodeSource;

public class Main {

    public static void main(String[] args) throws URISyntaxException {
        CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
        File jarFile = new File(codeSource.getLocation().toURI().getPath());
        String jarDir = jarFile.getParentFile().getPath();

        String[] str = args;

        String path;
        if (str.length == 0){
            path = jarDir;
            //path = "src/main/java/ua/hillel/kalina/lessons/lesson_020/resourse";
        }else {
            path = String.valueOf(str[0]);
        }

        ConverterService.convertFiles(path, path + "/Converted");
    }
}