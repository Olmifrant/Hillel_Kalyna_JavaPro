package lesson_008;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Collection collection = new CollectionImpl();

        for (int i = 1; i < 15; i++) {
            String arr = Integer.toString(i);
            collection.addValue(arr);
        }


        Collection coll = new CollectionImpl();
        coll.addValue(collection.toString());



        while (true) {
            System.out.println();
            System.out.println("Выберете вариант из списка: ");
            System.out.println("01. Вывести на экран весь массив");
            System.out.println("02. Добавить значение в массив");
            System.out.println("03. Добавить значение в заданную ячейку");
            System.out.println("04. Удалить значение");
            System.out.println("05. Вывести значение заданной ячейки на экран");
            System.out.println("06. Проверить есть ли такое значение в коллекции");
            System.out.println("07. Сравнить коллекции");
            System.out.println("08. Очистить коллекцию");
            System.out.println("09. Узнать размер коллекции");
            System.out.println("10. Завершить работу");

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
                case 1: collection.print(); break;
                case 2: collection.addValue(userValue()); break;
                case 3: collection.addIndexAndValue(userIndex(), userValue()); break;
                case 4: collection.delete(userValue()); break;
                case 5: collection.getIndex(userIndex()); break;
                case 6: collection.contain(userValue()); break;
                case 7:; collection.eequals(testCol());break;
                case 8: collection.clear(); break;
                case 9: collection.size(); break;
                case 10: System.out.println("Завершение работы"); return;
                default: System.out.println("Выберите вариант из списка пожалуйста!");
            }
        }
    }

    public static int userIndex() {

        System.out.println("Введите номер коллекции");

        Scanner scan = new Scanner(System.in);
        int n = 0;
        while (true) {
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                scan.nextLine();
                break;
            } else {
                System.out.println("Только цифры пожалуйста!");
                scan.nextLine();
            }
        }
        return n;
    }

    public static String userValue() {
        System.out.println("Введите значение коллекции");
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();
        return str;
    }

    public static Object testCol() {

        List<String> test = new ArrayList<>();
        for (int i = 1; i <17 ; i++) {
            test.add(Integer.toString(i));
        }

        return  test;
    }
}
