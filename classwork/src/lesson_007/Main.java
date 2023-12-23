package lesson_007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Массив");

        MyArrayList myArrayList = new MyArrayList();

        int a = 0;
        for (int i = 1; i <= 15; i++) {
            String arr = Integer.toString(i);
            myArrayList.addValue(arr);

        }

        while (true) {
            System.out.println();
            System.out.println("Выберете вариант из списка: ");
            System.out.println("01. Вывести на экран весь массив");
            System.out.println("02. Добавить значение в массив");
            System.out.println("03. Добавить значение в заданную ячейку");
            System.out.println("04. Удалить значение по номеру ячейки");
            System.out.println("05. Удалить значение");
            System.out.println("06. Вывести значение заданной ячейки на экран");
            System.out.println("07. Завершить работу");

            Scanner scan = new Scanner(System.in);
            int choice = 0;
            while (true) {
                if (scan.hasNextInt()) {
                    choice = scan.nextInt();
                    scan.nextLine();
                    if (choice >= 1 && choice <= 7) {
                        break;
                    } else {
                        System.out.println("Выберите вариант из списка пожалуйста!");
                    }
                } else {
                    System.out.println("Только цифры пожалуйста!");
                    scan.nextLine();
                }
            }

            switch (choice) {

                case 1:
                    myArrayList.print();
                    break;

                case 2:
                    myArrayList.addValue(userValue());
                    break;

                case 3:
                    myArrayList.addIndexAndValue(userIndex(), userValue());
                    break;

                case 4:
                    myArrayList.remove(userIndex());
                    break;

                case 5:
                    myArrayList.removeValue(userValue());
                    break;

                case 6:
                    myArrayList.get(userIndex());
                    break;

                case 7:
                    return;

                default:
                    System.out.println("JAVе так спокойнее");
                    continue;
            }
        }

    }

    public static int  userIndex () {

        System.out.println("Введите номер ячейки");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        return n;
    }

    public static String userValue () {
        System.out.println("Введите значение ячейки");
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();
        return str;
    }

}


