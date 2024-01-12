package lesson_010.Hw_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FileData {

    private String path;
    private String name;
    private int size;

    public FileData(String paht, String name, int size) {
        this.path = paht;
        this.name = name;
        this.size = size;

    }

    public List File  () {

        List<String> file = new ArrayList<>();
        file.add(path);
        file.add(name);
        file.add(Integer.toString(size));

        return file;
    }
}
