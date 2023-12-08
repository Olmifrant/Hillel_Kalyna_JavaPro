package lesson_003;

public class Hw3_05 {

    public static void main(String[] args) {

        //Дано змінні x і n обчислити x^n.


        System.out.println();
        System.out.println("Число x в степени n");
        int x = 25;
        int n = 8;
        long f = x;

        for (int i = 1; i < n; i++) {
            f = f * x;}

        System.out.println("Число " + x + " в степени " + n + " будет равно " + f);

    }
}
