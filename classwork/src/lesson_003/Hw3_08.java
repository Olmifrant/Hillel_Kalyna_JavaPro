package lesson_003;

public class Hw3_08 {

    public static void main(String[] args) {

        // Створіть масив, що містить 10 перших непарних чисел.
        // Виведіть елементи масиву на консоль в один рядок, розділяючи комою.



        int m = 10;
        int[] mass = new int[m];

        int x = 1;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = x;
            x = x + 2;
        }

        System.out.println();
        System.out.print("Элементы массива ");
        for (int i = 0; i < mass.length; i++) {
            if (i == mass.length - 1) {
                System.out.print(mass[i]);
            } else {
                System.out.print(mass[i] + ", ");
            }
        }

        System.out.println();
    }
}
