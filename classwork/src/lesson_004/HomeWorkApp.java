package lesson_004;

public class HomeWorkApp {

    public static void main(String[] args) {

        PrintThreeWords();
        CheckSumSign();
        PrintColor();
        CompareNumbers();
        NumericRange(5,10);
        CheckingNumber(52);
        CheckNum(77);
        StringAndNumber("Какой чудесный день",5);
        LeapYear(2024);
    }

    public static void PrintThreeWords() {

        System.out.println("Задание 1 - 2");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void CheckSumSign() {

        System.out.println("Задание 3");
        int a = -5;
        int b = 1;

        if ((a + b) >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    public static void PrintColor() {

        System.out.println("Задание 4");
        int value = 100;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Жeлтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void CompareNumbers(){

        System.out.println("Задание 5");
        int a = 4;
        int b = 1;

        if (a >= b ) {
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }

    public static boolean NumericRange(int a , int b){

        System.out.println("Задание 6");
        System.out.println("вывод результата не предусмотрен");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    public static void CheckingNumber(int a){

        System.out.println("Задание 7");
        if (a >= 0) System.out.println("Число " + a + " положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    public static boolean  CheckNum (int a) {

        System.out.println("Задание 8");
        System.out.println("вывод результата не предусмотрен");
        if (a < 0) return true;
        return false;
    }

    public static void StringAndNumber(String str, int a){

        System.out.println("Задание 9");
        for (int i = 0; i <a ; i++) {
            System.out.println(str);
        }
    }

    public static void LeapYear (int year){

        System.out.println("Задание 10");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }

}