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

        HashMap<Integer, String> map = new HashMap<>();

        for (Object str1 : set) {
            int count = 0;
             for (Object str2 : list) {
                 if (str1.equals(str2)) {
                     count++;
                 }
             }
            map.put(count, (String) str1);
        }
        return map;
    }

}





