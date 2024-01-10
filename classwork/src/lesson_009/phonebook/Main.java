package lesson_009.phonebook;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        Record rec = new Record();


        while (true) {
            System.out.println();
            System.out.println("Выберете вариант из списка: ");
            System.out.println("01. Показать весь справочник");
            System.out.println("02. Добавить контакт");
            System.out.println("03. Показать контакт");
            System.out.println("04. Редактировать контакт");
            System.out.println("05. Удалить контакт");
            System.out.println("6. Завершить работу");

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
                case 1: phonebook.list(); break;
                case 2: phonebook.add(); break;
                case 3: phonebook.show(); break;
                case 4: phonebook.edit(); break;
                case 5: phonebook.delete(); break;
                case 6: System.out.println("Завершение работы"); return;
                default: System.out.println("Выберите вариант из списка пожалуйста!");
            }
        }
    }
}