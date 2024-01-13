package lesson_010.Hw_12;

import java.util.*;

public class FileNavigator {

    HashMap<String,List> map = new HashMap<>();


    public void add (String name, int size, String paht) {

        FileData file = new FileData(name, size, paht);

        List<String> input = new ArrayList<>(file.File());
        List<List> test = new ArrayList<>();

        test.add(Collections.singletonList(input.get(0)));
        test.add(Collections.singletonList(input.get(1)));

        if (map.containsKey(input.get(2))){

            List<List> strings = new ArrayList<>(map.get(input.get(2)));

            strings.add(Collections.singletonList(input.get(0)));
            strings.add(Collections.singletonList(input.get(1)));
            map.put(input.get(2),strings);

        }else {
            map.put(input.get(2),test);

        }
    }

    public List find (String path){

        ArrayList<String> sd = new ArrayList<>();
        sd.addAll(map.get(path));
        return sd;
    }


    public List filterBuSize(int size){

        List<List> list = new ArrayList<>();

        for (Map.Entry<String, List> entry : map.entrySet()) {
            List value = entry.getValue();
            list.addAll(value);
        }
        System.out.println(list);
        System.out.println(list.get(1));


            return null;

    }


    public Map print(){
       return map;
    }

}
