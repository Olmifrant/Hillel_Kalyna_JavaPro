package lesson_010.Hw_12;

import java.util.*;

public class FileNavigator {
    private HashMap<String, List<List>> map = new HashMap<>();

    public Map print() {
        return map;
    }

    public void add(String name, Integer size, String paht) {

        FileData file = new FileData(name, size, paht);

        if (map.containsKey(file.path)) {

            List<List> listList = new ArrayList<>(map.get(file.path));
            List<String> stringList = new ArrayList<>();
            stringList.add(name);
            stringList.add(String.valueOf(size));
            stringList.add(paht);
            listList.add(stringList);
            map.put(file.path, listList);

        } else {
            List<List> listList = new ArrayList<>();
            List<String> stringList = new ArrayList<>();
            stringList.add(name);
            stringList.add(String.valueOf(size));
            stringList.add(paht);
            listList.add(stringList);
            map.put(file.path, listList);
        }
    }

    public List find(String path) {

        List<List> list = new ArrayList<>();
        list.addAll(map.get(path));
        //System.out.println(list.size());
        return list;
    }

    public List filterBuSize(int size) {

        List<List> list = new ArrayList<>();
        List<List> rezult = new ArrayList<>();
        for (Map.Entry<String, List<List>> entry : map.entrySet()) {
            list.addAll(entry.getValue());
        }
        for (int i = 0; i < list.size(); i++) {
            Integer d = Integer.valueOf((String) list.get(i).get(1));
            if (d < size) {
                rezult.add(list.get(i));
            }
        }
        return rezult;
    }

    public void remove(String path) {
        map.remove(path);
    }

    public List sortBySize() {

        List<List> list = new ArrayList<>();

        for (Map.Entry<String, List<List>> entry : map.entrySet()) {
            list.addAll(entry.getValue());
        }

        Map<Integer,List> map2 = new TreeMap<>();
        for (int i = 0; i < list.size(); i++) {

            List <String> list1 = new ArrayList<>();
            list1.add((String) list.get(i).get(0));
            list1.add((String) list.get(i).get(1));
            list1.add((String) list.get(i).get(2));

            Integer d = Integer.valueOf((String) list.get(i).get(1));
            map2.put(d,list1);
        }

        List<List> rezult = new ArrayList<>();
        for (Map.Entry<Integer, List> entry1 : map2.entrySet()) {
            rezult.addAll(entry1.getValue());
        }
        return rezult;
    }
}
