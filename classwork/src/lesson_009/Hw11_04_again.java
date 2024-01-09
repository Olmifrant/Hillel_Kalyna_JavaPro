package lesson_009;

import java.util.*;

public class Hw11_04_again {

//    Створити метод findOccurance, що приймає на вхід рядковий список як параметр.
//    Список заповнений довільними словами 10-20 штук, які можуть повторюватись
//    у необмеженій кількості. Обчислити скільки разів трапляється кожне слово.
//    Результат повернути у вигляді списку структур, що описують повторення
//    кожного окремого взятого слова.

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        int size = 100;
        for (int i = 0; i < size ; i++) {
            int n = (int) ((Math.random() * 5) +1);
            switch (n){
                case 1: list1.add("Кот"); break;
                case 2: list1.add("Пес"); break;
                case 3: list1.add("Лис"); break;
                case 4: list1.add("Ёж"); break;
                case 5: list1.add("Гусь"); break;
            }
        }
        System.out.println(findOccurance(list1));
    }

    public static HashMap findOccurance(List list) {

        Set<String> set = new HashSet<>(list);
        ArrayList<String> setUni = new ArrayList<>(set);

        String[] uniqList = new String[set.size()];
        for (int i = 0; i < uniqList.length; i++) {
            uniqList[i] = setUni.get(i);
        }

        String[] any = new String[list.size()];
        for (int i = 0; i < any.length; i++) {
            any[i] = list.get(i).toString();
        }

        HashMap<Integer , String> map = new HashMap<>();

        for (int i = 0; i < uniqList.length; i++) {
            int count = 0;
            for (int j = 0; j < any.length; j++) {
                if (uniqList[i].equals(any[j])) {
                    count++;
                }
            }
            //System.out.println("Значение " + uniqList[i] + " повторяется " + count + " раз");
            map.put(count, uniqList[i]);
        }
        return map;
    }
}





