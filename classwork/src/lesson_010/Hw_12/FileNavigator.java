package lesson_010.Hw_12;

import java.util.*;
public class FileNavigator {
    private HashMap<String, List<List>> map = new HashMap<>();

    public void add (String name, Integer size, String paht) {

        FileData file = new FileData(name, size,paht);

        if (map.containsKey(file.path)){

            List <List> listList = new ArrayList<>(map.get(file.path));
           List<String> stringList = new ArrayList<>();
           stringList.add(name);
           stringList.add(String.valueOf(size));
           stringList.add(paht);
           listList.add(stringList);
            map.put(file.path, listList);

        }else{
            List<List> listList = new ArrayList<>();
            List <String>  stringList = new ArrayList<>();
           stringList.add(name);
           stringList.add(String.valueOf(size));

           stringList.add(paht);
           listList.add(stringList);

//           List<FileData> objects = new ArrayList<>();
//           objects.add((FileData) stringList);
            map.put(file.path, listList);

//            System.out.println(stringList);
//            System.out.println(stringList.get(0));
//            System.out.println(stringList.get(1));
//            System.out.println(stringList.get(2));
        }
    }

    public List find (String path) {

//        List<List> list = new ArrayList<>();
//        list.addAll((Collection<? extends List>) map.get(path));
        return null;
    }


    public List FilterBuSize(int size) {

        List<List> list = new ArrayList<>();
        List <List> rezult = new ArrayList<>();
        for (Map.Entry<String, List<List>> entry : map.entrySet()) {
            list.addAll(entry.getValue());

        }


        for (int i = 0; i < list.size(); i++) {
            Integer d = Integer.valueOf((String) list.get(i).get(1));
            if (d< size) {
                //System.out.println(list.get(i));
                rezult.add(list.get(i));

            }
        }
        System.out.println(rezult.size());
        return rezult;
    }

    public Map print (){

       return map;
    }





}
