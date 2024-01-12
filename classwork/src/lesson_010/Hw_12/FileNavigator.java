package lesson_010.Hw_12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class FileNavigator {

    HashMap<String,Object> map = new HashMap<>();


    public void add (String paht, String name, int size) {

        FileData fileData = new FileData(paht, name, size);

        List<String> test = new ArrayList<>();
        test.add((String) fileData.File().get(1));
        test.add((String) fileData.File().get(2));

        map.put((String) fileData.File().get(0),test);

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


}
