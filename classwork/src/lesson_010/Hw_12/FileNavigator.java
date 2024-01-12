package lesson_010.Hw_12;

import java.lang.reflect.Array;
import java.util.*;

public class FileNavigator {

    HashMap<String,List> map = new HashMap<>();


    public void add (String name, int size, String paht) {

        FileData file = new FileData(name, size, paht);

        List<String> input = new ArrayList<>(file.File());
        List<List> test = new ArrayList<>();

        test.add(Collections.singletonList(input.get(0)));
        test.add(Collections.singletonList(input.get(1)));

        //System.out.println(input);
//        System.out.println(input.get(0));
        //System.out.println(input.get(2));
        //map.put(input.get(2),test);



        if (map.containsKey(input.get(2))){

            List<List> strings = new ArrayList<>(map.get(input.get(2)));
            strings.add(test);
            map.put(input.get(2),strings);

        }else {
            map.put(input.get(2),test);

        }



        //System.out.println(map.size());

        //System.out.println(input);
        //System.out.println(map);
        //System.out.println(test);
        //System.out.println(map.get(String.format("D://Media//Photo//2019//")));

    }

    public void find (){

        ArrayList<String> sd = new ArrayList<>();
        for (int i = 0; i < map.size(); i++) {
            //System.out.println(map.get(String.format("D://Media//Photo//2019//")));
            //sd.add((String) map.get(String.format("D://Media//Photo//2019//")));

        }
        System.out.println(sd);
        //System.out.println(map.get(String.format("D://Media//Photo//2019//")));
    }


    public void print(){
        System.out.println(map);
    }

}
