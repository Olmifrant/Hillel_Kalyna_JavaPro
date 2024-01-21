package ua.hillel.kalina.lessons.lesson_009;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw11_01 {

//    Створити метод countOccurance, що приймає на вхід рядковий список як параметр і довільний рядок.
//    Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості.
//    Порахувати скільки разів зустрічається переданий рядок як другий аргумент.

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

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

        System.out.println("Элемент " + str + " встречается в коллекции " + countOccurance(list1, str) + " раз");
        //countOccurance(list1, str);

    }

    public static int countOccurance(ArrayList list, String str) {

        int count = 0;

        for (Object st : list)
            if (str.equals(st)) {
                count++;
            }
        return count;
    }
}
