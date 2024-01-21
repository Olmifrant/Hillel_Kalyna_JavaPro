package ua.hillel.kalina.lessons.lesson_004;

public class Hw4_02 {

    public static void main(String[] args) {

        CheckSumSign();

    }

    public static void CheckSumSign () {

        int a = -5;
        int b = 1;

        if ( (a + b ) >= 0){
            System.out.println("Сума позитивна");
        }else {
            System.out.println("Сума негативна");
        }
    }
}
