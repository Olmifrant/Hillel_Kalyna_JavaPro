package lesson_002;

import java.util.Arrays;

public class Hw2_02 {

    public static void main(String[] args) {


        int[] mass = new int[250];
        for (int i = 0; i < mass.length; i++) {
            int rand1 = (int) (Math.random() * 100);
            mass[i] = rand1;
        }

        System.out.println();
        System.out.print("250 случайных чисел ");
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            if (i == mass.length - 1) {
                System.out.print(mass[i]);
            } else {
                System.out.print(mass[i] + ", ");
            }
        }

        System.out.println();

        double summary =0;
        for (double i = 0; i < mass.length; i++) {
            summary = Arrays.stream(mass).sum();
        }
        double averageSummary = (summary / mass.length);
        System.out.println("Cреднее арифметическое " + averageSummary);



    }
}
