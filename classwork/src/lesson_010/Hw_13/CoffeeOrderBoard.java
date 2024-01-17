package lesson_010.Hw_13;

import java.util.*;

public class CoffeeOrderBoard {

    NavigableMap <Integer,List<Order>> map =new TreeMap<>();

    public void add (String name, Integer numm) {

        if (map.isEmpty()) {
            map.put(0, new ArrayList<>());
            map.get(0).add(new Order(name, 0 ));
        }else {
            Integer actualNumm = map.lastEntry().getValue().getLast().getNumm() +1;
            map.put(actualNumm, new ArrayList<>());
            map.get(actualNumm).add(new Order(name, actualNumm));
        }
    }

     public void draw () {

         for (Map.Entry<Integer, List<Order>> entry : map.entrySet())
             for (int i = 0; i < entry.getValue().size(); i++) {

                 System.out.println("Клиент " + entry.getValue().get(i).getName() +
                         " номер очереди " + entry.getValue().get(i).getNumm());
             }
     }

     public void deliverFirst (){

      System.out.println("Ближайший заказ в очереди под номером " +
              map.firstEntry().getValue().getFirst().getNumm() + " выдан клиету " +
              map.firstEntry().getValue().getFirst().getName() + " и больше не сущестует");

        map.pollFirstEntry();

     }
     public  void deliverySome (Integer nummOrder) {

        if (map.containsKey(nummOrder)){

            System.out.println("Заказ номер " + nummOrder + " выдан клиенту "
                           +  map.get(nummOrder).getFirst().getName() + "и больше не существует");
            map.remove(nummOrder);

        }else {
            System.out.println("Заказа с номером " + nummOrder + " нет с списке заказов");
        }
     }
}


