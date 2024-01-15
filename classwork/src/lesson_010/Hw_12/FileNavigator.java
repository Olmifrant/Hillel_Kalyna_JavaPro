package lesson_010.Hw_12;

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

    public void add(String name, Integer size, String path) {

        //System.out.println(name+size+path);

        if (map.get(path) == null) {
            map.put(path, new ArrayList<>());
            map.get(path).add(new FileData(name,size,path));
        }else {
            map.get(path).add(new FileData(name,size,path));
        }
//        return true;
    }

    public List find(String path) {

        List<List> list = new ArrayList<>();
//        list.addAll((Collection<? extends List>) map.get(path));
//        //System.out.println(list.size());
        return list;
    }

    public List<FileData> filterBuSize(int size) {

        List<FileData> rezult = new ArrayList<>();

        for (Map.Entry<String, List<FileData>> entry : map.entrySet())
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println(entry.getValue().get(i).getName());

            }

//




//        List<List> list = new ArrayList<>();
//        List<List> rezult = new ArrayList<>();
//        for (Map.Entry<String, List<FileData>> entry : map.entrySet()) {
//            list.addAll((Collection<? extends List>) entry.getValue());
//        }
//        for (int i = 0; i < list.size(); i++) {
//            Integer d = Integer.valueOf((String) list.get(i).get(1));
//            if (d < size) {
//                rezult.add(list.get(i));
//            }
//        }
        return null;
    }

    public void remove(String path) {
        map.remove(path);
    }

    public List sortBySize() {

        List<List> list = new ArrayList<>();

//        for (Map.Entry<String, List<List>> entry : map.entrySet()) {
//            list.addAll(entry.getValue());
//        }
//
//        Map<Integer,List> map2 = new TreeMap<>();
//        for (int i = 0; i < list.size(); i++) {
//
//            List <String> list1 = new ArrayList<>();
//            list1.add((String) list.get(i).get(0));
//            list1.add((String) list.get(i).get(1));
//            list1.add((String) list.get(i).get(2));
//
//            Integer d = Integer.valueOf((String) list.get(i).get(1));
//            map2.put(d,list1);
//        }
//
        List<List> rezult = new ArrayList<>();
//        for (Map.Entry<Integer, List> entry1 : map2.entrySet()) {
//            rezult.addAll(entry1.getValue());
//        }
        return rezult;
    }
}
