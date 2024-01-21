package ua.hillel.kalina.lessons.lesson_010.Hw_12;

import java.util.*;
public class FileNavigator {
    private HashMap<String, List<FileData>> map = new HashMap<>();

    public List print() {

        List<List> rezult = new ArrayList<>();
        for (Map.Entry<String, List<FileData>> entry : map.entrySet())
            for (int i = 0; i < entry.getValue().size(); i++) {
                List list = new ArrayList<>();
                list.add((entry.getValue().get(i).getName()));
                list.add(entry.getValue().get(i).getSize());
                list.add((entry.getValue().get(i).getPath()));
                rezult.add(list);
            }
        return rezult;
    }

    public boolean add(String name, Integer size, String path) {

        if (map.get(path) == null) {
            map.put(path, new ArrayList<>());
            map.get(path).add(new FileData(name,size,path));
        }else {
            map.get(path).add(new FileData(name,size,path));
        }
        return true;
    }

    public List find(String path) {

        List<List> rezult = new ArrayList<>();

        for (int i = 0; i < map.get(path).size(); i++) {
            List list = new ArrayList<>();
            list.add(map.get(path).get(i).getName());
            list.add(map.get(path).get(i).getSize());
            list.add(map.get(path).get(i).getPath());
            rezult.add(list);
        }
        return rezult;
    }

    public List<List> filterBuSize(int size) {

        List<List> rezult = new ArrayList<>();

        for (Map.Entry<String, List<FileData>> entry : map.entrySet())
            for (int i = 0; i < entry.getValue().size(); i++) {
                List  list = new ArrayList<>();
                if (size > entry.getValue().get(i).getSize() ){

                    list.add(entry.getValue().get(i).getName());
                    list.add(entry.getValue().get(i).getSize());
                    list.add(entry.getValue().get(i).getPath());
                    rezult.add(list);
                }
            }
        return rezult;
    }

    public void remove(String path) {
        map.remove(path);
    }

    public Map sortBySize() {

        Map<Integer,List> map2 = new TreeMap<>();

        for (Map.Entry<String, List<FileData>> entry : map.entrySet())
            for (int i = 0; i < entry.getValue().size(); i++) {

                List <String> list = new ArrayList<>();
                    list.add(entry.getValue().get(i).getName());
                    list.add(entry.getValue().get(i).getSize().toString());
                    list.add(entry.getValue().get(i).getPath());

                    map2.put(entry.getValue().get(i).getSize(),list);

            }
        return map2;
    }
}
