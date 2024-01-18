package lesson_011;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayValueCalculator {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] mass = new String[4][4];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                int in = (int) ((Math.random() * 10));
                mass[i][j] = String.valueOf(in);
            }
        }
        String[][] mass1 = new String[4][4];
        for (int i = 0; i < mass1.length; i++) {
            for (int j = 0; j < mass1[i].length; j++) {
                int in = (int) ((Math.random() * 10));
                mass1[i][j] = String.valueOf(in);
            }
        }
        mass1[3][1] = "БУМ";

        String[][] mass2 = new String[4][5];
        for (int i = 0; i < mass2.length; i++) {
            for (int j = 0; j < mass2[i].length; j++) {
                int in = (int) ((Math.random() * 10));
                mass2[i][j] = String.valueOf(in);
            }
        }

        while (true) {
            System.out.println();
            System.out.println("Выберете вариант из списка: ");
            System.out.println("01. Передача нормального массива 4*4");
            System.out.println("02. Передача массива 4*4 с неверным значением в ячейке");
            System.out.println("03. Передача массива неправильной формы");
            System.out.println("04. Завершить работу");

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
                case 1: System.out.println(doCalc(mass)); break;
                case 2: System.out.println(doCalc(mass1)); break;
                case 3: System.out.println(doCalc(mass2)); break;
                case 4: System.out.println("Завершение работы"); return;
                default: System.out.println("Выберите вариант из списка пожалуйста!");
            }
        }
    }


    public static  int  doCalc (String[][] massive) throws MyArraySizeException, MyArrayDataException {

        Arrays.stream(massive).map(Arrays::toString).forEach(System.out::println);

            int sum = 0;
            if (4 != massive.length) throw new MyArraySizeException();
            for (int i = 0; i < massive.length; i++) {
                if (4 != massive[i].length) throw new MyArraySizeException();
                for (int k = 0; k < massive[i].length; k++) {
                    try {
                        sum += Integer.parseInt(massive[i][k]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, k);
                    }
                }
            }
            return sum;
    }
}


