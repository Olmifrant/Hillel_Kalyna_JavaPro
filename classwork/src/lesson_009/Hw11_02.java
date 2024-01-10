package lesson_009;

import java.util.*;

public class Hw11_02 {

//    Створити метод toList, що приймає на вхід цілісний масив довільної довжини.
//    Конвертувати масив у список відповідного типу даних та повернути з методу.

    public static void main(String[] args) {

        String[] array = new String[20];

        for (int i = 0; i < array.length; i++) {
            String arr = Integer.toString(i);
            array[i] = arr;
        }

        System.out.println("Array " + Arrays.toString(array));
        System.out.println(" List  " + toList(array));
    }

    public static List toList(String[] str) {

        List list = new ArrayList(Arrays.asList(str));

        return list;
    }
}

