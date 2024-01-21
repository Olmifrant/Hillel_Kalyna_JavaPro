package ua.hillel.kalina.lessons.lesson_009;

import java.util.*;

public class Hw11_04 {

//    Створити метод calcOccurance, який приймає на вхід рядковий список як параметр.
//    Список заповнений довільними словами 10-20 штук, які можуть повторюватись у
//    необмеженій кількості. Обчислити скільки разів трапляється кожне слово.
//    Результат вивести у консоль.

    public static void main(String[] args) {

        ArrayList <String> list1 = new ArrayList<>();

        int size = 20;
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
        calcOccurance(list1);
    }

    public static void calcOccurance (List list){

        Set<String> set = new HashSet<>(list);
        System.out.println(list);

        for (String str1 : set) {
            int count = 0;
            for (Object str2 : list ) {
                if (str1.equals(str2)) {
                    count++;
                }
            }
            System.out.println("Значение " + str1 + " повторяется " + count + " раз");

        }
    }
}

