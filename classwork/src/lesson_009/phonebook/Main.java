package lesson_009.phonebook;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();

        while (true) {
            System.out.println();
            System.out.println("Выберете вариант из списка: ");
            System.out.println("01. Показать весь справочник");
            System.out.println("02. Добавить контакт");
            System.out.println("03. Найти и показать контакт (одно совпадение)");
            System.out.println("04. Найти и показать контакт (все совпадения)");
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
                case 1: System.out.println(phonebook.list()); break;
                case 2: phonebook.add(user(),userPhone());  break;
                case 3: System.out.println(phonebook.find(user())); break;
                case 4: System.out.println(phonebook.findAll(user())); break;
                case 5: System.out.println("Завершение работы"); return;
                default: System.out.println("Выберите вариант из списка пожалуйста!");
            }
        }

    }

    public static String userPhone() {

        System.out.println("Введите номер");
        Scanner scan = new Scanner(System.in);
        long n;
        while (true) {
            if (scan.hasNextLong()) {
                n = scan.nextLong();
                scan.nextLine();
                break;
            } else {
                System.out.println("Только цифры пожалуйста!");
                scan.nextLine();
            }
        }
        String st = Long.toString(n);
        return st;
    }

    public static String user() {

        System.out.println("Введите имя");
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();
        return str;
    }
}