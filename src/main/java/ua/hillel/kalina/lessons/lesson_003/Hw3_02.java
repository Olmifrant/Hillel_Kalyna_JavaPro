package ua.hillel.kalina.lessons.lesson_003;

public class Hw3_02 {
    public static void main(String[] args) {

        //Дано число n за допомогою циклу for порахувати факторіал n!

        System.out.println("Факториал числа");
        int num = 12;
        int factorial = num;

        for (int i = (num - 1); i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println();
        System.out.println("Факториал " + num + " это: " + factorial);
    }
}