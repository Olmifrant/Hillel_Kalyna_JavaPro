package ua.hillel.kalina.lessons.lesson_027;

import java.io.File;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        CoffeeOrderBoard board = new CoffeeOrderBoard();

        int size = 20;

        for (int i = 0; i < size; i++) {

            String nam = null;
            String nam01 = null;
            String nam02 = null;

            int n = (int) ((Math.random() * 5) + 1);
            nam = switch (n) {
                case 1 -> ("Ли ");
                case 2 -> ("Ван ");
                case 3 -> ("Лю ");
                case 4 -> ("Чень ");
                case 5 -> ("Сунь ");
                default -> nam;
            };
            int k = (int) ((Math.random() * 5) + 1);
            nam01 = switch (k) {
                case 1 -> ("Мао ");
                case 2 -> ("Ши ");
                case 3 -> ("Хоу ");
                case 4 -> ("Лун ");
                case 5 -> ("Инь ");
                default -> nam01;
            };

            int m = (int) ((Math.random() * 5) + 1);
            nam02 = switch (m) {
                case 1 -> ("Вень ");
                case 2 -> ("Ми ");
                case 3 -> ("Хоу ");
                case 4 -> ("Пунь ");
                case 5 -> ("Синь ");
                default -> nam02;
            };

            String name = nam + nam01 + nam02;
            board.add(name);

        }

        while (true) {
            System.out.println();
            System.out.println("Выберете вариант из списка: ");
            System.out.println("01. Добавить нового клиента");
            System.out.println("02. Выдать ближайший заказ");
            System.out.println("03. Выдать случайный заказ");
            System.out.println("04. Показать всеx клиентов");
            System.out.println("05. Завершить работу");

            Scanner scan = new Scanner(System.in);
            int choice = 0;
            while (true) {
                if (scan.hasNextInt()) {
                    choice = scan.nextInt();
                    scan.nextLine();
                    break;
                } else {
                    System.out.println("Только цифры пожалуйста!");
                    scan.nextLine();
                }
            }

            switch (choice) {
                case 1: board.add(user()); break;
                case 2: board.deliverFirst(); break;
                case 3: board.deliverySome(orderNumm()); break;
                case 4: board.draw(); break;
                case 5: System.out.println("Завершение работы"); return;
                default: System.out.println("Выберите вариант из списка пожалуйста!");
            }
        }

    }

    public static String user() {

        System.out.println("Введите имя");
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();
        return str;
    }

    public static int orderNumm() {

        System.out.println("Введите номер");
        Scanner scan = new Scanner(System.in);
        int n;
        while (true) {
            if (scan.hasNextLong()) {
                n = scan.nextInt();
                scan.nextLine();
                break;
            } else {
                System.out.println("Только цифры пожалуйста!");
                scan.nextLine();
            }
        }

        //String st = Long.toString(n);
        return n;
    }

}
