package lesson_009;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hw11_01 {

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

        System.out.println("Что мы ищем");
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();

        countOccurance(list1, str);

    }
    public static void countOccurance (List list, String str){

        String [] arr = new String[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i).toString().toUpperCase();
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str.toUpperCase())){
                count++;
            }
        }

        if( count > 0){
            System.out.println("Элемент " + str + " встречается " + count + " раз");
        }else {
            System.out.println("Такого элемента нет в коллекции");
        }
    }
}
