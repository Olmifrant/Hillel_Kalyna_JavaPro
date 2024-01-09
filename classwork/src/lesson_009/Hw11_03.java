package lesson_009;

import java.util.*;

public class Hw11_03 {

//    Створити метод findUnique, що приймає на вхід числовий список, що складається
//    з довільних значень, які можуть повторюватися в необмеженій кількості. Необхідно
//    повернути новий числовий список, що містить тільки унікальні числа.

    public static void main(String[] args) {

        ArrayList <Integer> list1 = new ArrayList<>();

        int size = 25;
        for (int i = 0; i < size ; i++) {
            list1.add( (int) ((Math.random() * size )));
        }

        Collections.sort(list1);
        System.out.println(list1);
        System.out.println(findUnique(list1));
    }

    public static List<String> findUnique (List list){

        Set <String> set = new HashSet<>(list);
        ArrayList<String> uniq = new ArrayList<>(set);
        return uniq;
    }
}
