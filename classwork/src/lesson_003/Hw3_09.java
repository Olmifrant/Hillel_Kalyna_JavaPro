package lesson_003;

import java.util.Arrays;

public class Hw3_09 {

    public static void main(String[] args) {


        //Даний масив розмірності N, знайти найменший елемент масиву і вивести на консоль


        System.out.println();
        int[] mass = new int[25];
        for (int j = 0; j < mass.length; j++) {
            int rand1 = (int) ((Math.random() * 100));
            mass[j] = rand1;
        }
        System.out.print("Содержимое массива ");
        System.out.println();
        for (int j = 0; j < mass.length; j++) {
            if (j == mass.length - 1) {
                System.out.print(mass[j]);
            } else {
                System.out.print(mass[j] + ", ");
            }
        }

        int[] sortMass = Arrays.stream(mass).sorted().toArray();

        System.out.println();
        System.out.print("Отсортированное содержимое массива  ");
        System.out.println();
        for (int j = 0; j < sortMass.length; j++) {
            if (j == sortMass.length - 1) {
                System.out.print(sortMass[j]);
            } else {
                System.out.print(sortMass[j] + ", ");
            }
        }

        System.out.println();
        System.out.println("Наименьшее значение массива " + sortMass[0]);
        System.out.println();


    }
}
