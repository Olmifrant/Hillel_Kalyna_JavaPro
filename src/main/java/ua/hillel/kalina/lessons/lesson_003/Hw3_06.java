package ua.hillel.kalina.lessons.lesson_003;

public class Hw3_06 {
    public static void main(String[] args) {

      //  Вивести 10 перших чисел послідовності 0, -5,-10,-15

        int a = 5;
        int b = 5;
        int c = a;
        int limit = 10;

        for (int i = 0; i < limit; i++) {
            c = c - b;
            System.out.println("Число " + i + " Последовательности равно " + c);
        }
    }
}
