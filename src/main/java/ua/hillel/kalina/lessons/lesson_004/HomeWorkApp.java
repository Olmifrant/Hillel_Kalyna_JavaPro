package ua.hillel.kalina.lessons.lesson_004;
public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        numericRange(5,10);
        checkingNumber(52);
        checkNum(77);
        stringAndNumber("Какой чудесный день",5);
        leapYear(2024);
    }

    public static void printThreeWords() {

        System.out.println("Задание 1 - 2");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {

        System.out.println("Задание 3");
        int a = -5;
        int b = 1;

        if ((a + b) >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    public static void printColor() {

        System.out.println("Задание 4");
        int value = 1000;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жeлтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){

        System.out.println("Задание 5");
        int a = 4;
        int b = 1;

        if (a >= b ) {
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }

    public static boolean numericRange(int a , int b){

        System.out.println("Задание 6");
        System.out.println("вывод результата не предусмотрен");
        int sum = a + b;
        if (sum > 10 && sum < 20){
            return true;
        } else {
            return false;
        }
    }

    public static void checkingNumber(int a){

        System.out.println("Задание 7");
        if (a >= 0){
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    public static boolean  checkNum (int a) {

        System.out.println("Задание 8");
        System.out.println("вывод результата не предусмотрен");
        if (a < 0){
            return true;
        }else {
            return false;
        }
    }

    public static void stringAndNumber(String str, int a){

        System.out.println("Задание 9");
        for (int i = 0; i <a ; i++) {
            System.out.println(str);
        }
    }

    public static void leapYear (int year){

        System.out.println("Задание 10");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))){
            System.out.println(year + " г. не високосный");
        }
        else{
            System.out.println(year + " г. високосный");
        }
    }

}