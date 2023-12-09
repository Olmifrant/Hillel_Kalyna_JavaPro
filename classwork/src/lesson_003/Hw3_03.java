package lesson_003;

import java.util.Scanner;
public class Hw3_03 {
    public static void main(String[] args) {

        //Перепишіть програми 1 та 2 за допомогою циклу while.

        System.out.println("Часть 1");
        System.out.println("Нечетные числа 1 - 99 с циклом  while");
        int x = 0;
        int i = 100;
        while (i > x) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
            }
            x++;
        }

        System.out.println();
        System.out.println("Часть 2");
        System.out.println("Факториал числа с циклом while");

        int fact = 1;
        int l = 1;
        int num =12;

        while(l <= num ){
            fact = fact * l;
            l++;
        }
        System.out.println("Факториал " + num + " это: " + fact);
    }
}
