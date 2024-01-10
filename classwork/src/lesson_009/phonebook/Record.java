package lesson_009.phonebook;

import java.util.Scanner;

public class Record {

    private String name;
    private String phone;

    public String[] test (){

        String[] str = new String[2];
        str[0] = userValue();
        str[1] = userIndex();
        return str;
    }


    public static String userIndex() {

        System.out.println("Введите номер");
        Scanner scan = new Scanner(System.in);
        int n;
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
        String st = Integer.toString(n);
        return st;
    }

    public static String userValue() {

        System.out.println("Введите имя");
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();
        return str;
    }




}
