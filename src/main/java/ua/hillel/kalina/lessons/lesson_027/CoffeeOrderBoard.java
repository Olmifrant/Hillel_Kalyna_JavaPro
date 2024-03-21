package ua.hillel.kalina.lessons.lesson_027;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class CoffeeOrderBoard {

    NavigableMap <Integer,List<Order>> map = new TreeMap<>();

    private static final Logger addOrder = LoggerFactory.getLogger("addOrder");
    private static final Logger delivery = LoggerFactory.getLogger("delivery");

    public List add (String name) {

        List list = new ArrayList<>();

        if (map.isEmpty()) {
            map.put(0, new ArrayList<>());
            map.get(0).add(new Order(name, 0));

            list.add(map.lastEntry().getValue().getFirst().getName());
            list.add(map.lastEntry().getValue().getFirst().getNumm());
        }else {
            Integer actualNumm = map.lastEntry().getValue().get(0).getNumm() +1;
            map.put(actualNumm, new ArrayList<>());
            map.get(actualNumm).add(new Order(name, actualNumm));

            list.add(map.lastEntry().getValue().get(0).getName());
            list.add(map.lastEntry().getValue().get(0).getNumm());
        }

        addOrder.info(STR."Добавлен заказ для клиента \{name}");
        return list ;
    }

    public boolean draw () {

        for (Map.Entry<Integer, List<Order>> entry : map.entrySet())
            for (int i = 0; i < entry.getValue().size(); i++) {

                System.out.println(STR."Клиент \{entry.getValue().get(i).getName()} номер очереди \{entry.getValue().get(i).getNumm()}");
            }
        return true;
    }

    public String deliverFirst (){

        System.out.println(STR."Ближайший заказ в очереди под номером \{map.firstEntry().getValue().get(0).getNumm()} выдан клиенту \{map.firstEntry().getValue().get(0).getName()} и больше не существует");

        String name = map.firstEntry().getValue().get(0).getName();

        delivery.info(STR."Выдан заказ клиенту под номером \{map.firstEntry().getValue().get(0).getNumm()} имя клиента \{map.firstEntry().getValue().get(0).getName()}") ;

        map.pollFirstEntry();

        return name;
    }


    public String[] deliverySome (Integer nummOrder) {

        String[] string = new String[2];
        if (map.containsKey(nummOrder)){

            System.out.println(STR."Заказ номер \{nummOrder} выдан клиенту \{map.get(nummOrder).get(0).getName()} и больше не существует");

            string[0] = String.valueOf(map.get(nummOrder).get(0).getNumm());
            string[1] = map.get(nummOrder).get(0).getName();
            map.remove(nummOrder);

        }else {
            string = null;
            System.out.println(STR."Заказа с номером \{nummOrder} нет с списке заказов");
        }
        delivery.info(STR."Выдан заказ клиенту под номером \{map.firstEntry().getValue().get(0).getNumm()} имя клиента \{map.firstEntry().getValue().get(0).getName()}") ;

        return string;
    }
}
