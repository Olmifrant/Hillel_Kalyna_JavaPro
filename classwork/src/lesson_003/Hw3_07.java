package lesson_003;

import java.math.BigInteger;
import java.util.Scanner;
public class Hw3_07 {
    public static void main(String[] args) {

        //Необхідно вивести на екран таблицю множення на Х: (будь-яке число, що вводиться з консолі)

        Scanner sc1 = new Scanner(System.in);
        double m = 0;
        while (true) {
            System.out.println("Введите ваше число ");
            if (sc1.hasNextDouble()) {
                double userValue = sc1.nextDouble();
                System.out.println("Ваше число = " + userValue);
                System.out.println();
                m = userValue;
                sc1.nextLine();
                break;
            } else {
                System.out.println("Введенные данные не являются числом!");
                System.out.println();
                sc1.nextLine();
            }
        }

        double x = m;
        for (double i = 1; i <= 10; i++) {
            System.out.println(x + "*" + i + "=" + x * i);
        }
    }
}