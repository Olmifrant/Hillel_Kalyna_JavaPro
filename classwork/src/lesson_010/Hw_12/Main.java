package lesson_010.Hw_12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FileNavigator navigator = new FileNavigator();

        int size = 5;

        for (int i = 0; i < size; i++) {

            String pat = null;
            String nam01 = null;
            String nam02 = null;

            int siz = 0;
                int n = (int) ((Math.random() * 5) +1);
                switch (n){
                    case 1: pat = ("D://Media//Photo//2019//"); break;
                    case 2: pat = ("D://Media//Photo//2020//"); break;
                    case 3: pat = ("D://Media//Photo//2021//"); break;
                    case 4: pat = ("D://Media//Photo//2022//"); break;
                    case 5: pat = ("D://Media//Photo//2023//"); break;
                }
                int k = (int) ((Math.random() * 5) +1);
                switch (k){
                    case 1: nam01 = ("Миконос"); break;
                    case 2: nam01 = ("Крит"); break;
                    case 3: nam01 = ("Тинос"); break;
                    case 4: nam01 = ("Ираклия"); break;
                    case 5: nam01 = ("Халки"); break;
                }

            int f = (int) ((Math.random() * 100));
            nam02 = String.valueOf(f+ ".jpg");
            String nam = nam01 + nam02;
            siz = (int) (((Math.random() * 1000)));
            navigator.add(nam, siz, pat);
        }

        while (true) {
            System.out.println();
            System.out.println("Выберете вариант из списка: ");
            System.out.println("01. Показать все");
            System.out.println("02. Показать конкретную папку");
            System.out.println("03. Сорт");
            System.out.println("04. Удалить");
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
                case 1: System.out.println(navigator.print()); break;
                case 2: System.out.println(navigator.find("D://Media//Photo//2022//")); break;
                case 3: navigator.FilterBuSize(500); break;
                case 4: System.out.println("75"); break;
                case 5: System.out.println("Завершение работы"); return;
                default: System.out.println("Выберите вариант из списка пожалуйста!");
            }
       }


    }
}