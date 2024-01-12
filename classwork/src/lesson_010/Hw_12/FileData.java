package lesson_010.Hw_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FileData {

    private final String path;
    private final String name;
    private final int size;

    public FileData(String name, int size, String paht) {
        this.path = paht;
        this.name = name;
        this.size = size;

    }

    public List File  () {

        List<String> file01 = new ArrayList<>();
        file01.add(name);
        file01.add(String.valueOf(size));
        file01.add(path);

        //System.out.println(file01);

        return file01;
    }
}
