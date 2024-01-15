package lesson_010.Hw_12;

public class FileData {
    private String path;
    private String name;
    int size;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public FileData(String name, int size, String path) {
        this.name = name;
        this.size = size;
        this.path = path;
    }

}