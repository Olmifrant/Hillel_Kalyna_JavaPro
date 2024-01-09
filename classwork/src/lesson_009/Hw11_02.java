package lesson_009;

import java.util.*;

public class Hw11_02 {

    public static void main(String[] args) {

        String[] array = new String[15];

        for (int i = 0; i < array.length; i++) {
            String arr = Integer.toString(i);
            array[i] = arr;
        }

        System.out.println("Array " + Arrays.toString(array));
        System.out.println(" List  " + toList(array));
    }

 public static List toList(String[] str){

        LinkedList list = new LinkedList(Arrays.asList(str));

     return list;
 }
}

