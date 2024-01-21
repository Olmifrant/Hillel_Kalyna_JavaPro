package ua.hillel.kalina.lessons.lesson_003;

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

        System.out.println("Вид массива до сортировки");
        OutputMass(mass);

        int[] sortMass = Arrays.stream(mass).sorted().toArray();
        System.out.println("Вид массива после сортировки");
        OutputMass(sortMass);
        System.out.println("Наименьшее значение массива " + sortMass[0]);
    }

    public static void OutputMass(int[] mass) {

        String masss = Arrays.toString(mass);
        System.out.println(String.join(",", masss));
    }
}
