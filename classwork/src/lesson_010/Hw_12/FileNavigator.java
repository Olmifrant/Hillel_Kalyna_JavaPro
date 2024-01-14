package lesson_010.Hw_12;

import java.security.KeyStore;
import java.util.*;
public class FileNavigator {
    private HashMap<String, List<List>> map = new HashMap<>();

    public void add (String name, int size, String paht) {

        FileData file = new FileData(name, size,paht);

        if (map.containsKey(file.path)){
           List<List> stringList = new ArrayList<>(map.get(file.path));
           stringList.add(Collections.singletonList(file.name));
           stringList.add(Collections.singletonList(String.valueOf(file.size)));
           stringList.add(Collections.singletonList(file.path));
            map.put(file.path, stringList);
        }else{
            List<List> stringList = new ArrayList<>();
           stringList.add(Collections.singletonList(file.name));
           stringList.add(Collections.singletonList(String.valueOf(file.size)));
           stringList.add(Collections.singletonList(file.path));
            map.put(file.path, stringList);
        }
    }

    public List find (String path) {

        List<List> list = new ArrayList<>();
        list.addAll(map.get(path));

        return list;

    }


    public List FilterBuSize(int size) {

        List<FileData> list = new ArrayList<>();


        for (Map.Entry<String, List<List>> entry : map.entrySet()) {
            List value = entry.getValue();
            list.addAll(value);
        }
        System.out.println(list);
        System.out.println(list.get(1));




        return null;
    }

    public Map print (){

       return map;
    }





}
