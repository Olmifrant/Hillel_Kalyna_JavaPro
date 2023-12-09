package lesson_003;

public class Hw3_04 {
    public static void main(String[] args) {

        //Перепишіть програми 1 та 2 із використанням циклу do - while.

        System.out.println("Часть 1");
        System.out.println("Нечетные числа 1 - 99 с циклом do-while");
        int x = 0;
        int i = 100;
        do {
            if (x % 2 != 0) {
                System.out.print(x + " ");
            }
            x++;

        } while (x < i);

        System.out.println();

        System.out.println("Часть 2");
        System.out.println("Факториал числа с циклом do-while");

        int fact = 1;
        int l = 1;
        int num = 12;
        do {
            fact = fact * l;
            l++;

        } while (l <= num);
        System.out.println("Факториал " + num + " это: " + fact);

    }
}
