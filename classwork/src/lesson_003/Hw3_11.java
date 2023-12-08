package lesson_003;

public class Hw3_11 {

    public static void main(String[] args) {

        //Поміняти максимальний і найменший елементи масиву місцями.
        // Приклад: дано масив {4, -5, 0, 6, 8}. Після заміни виглядатиме {4, 8, 0, 6, -5}.


        System.out.println();
        int[] mass = new int[12];
        for (int j = 0; j < mass.length; j++) {
            int rand1 = (int) ((Math.random() * 100));
            mass[j] = rand1;
        }

        System.out.println("Содержимое массива ");

        for (int j = 0; j < mass.length; j++) {
            if (j == mass.length - 1) {
                System.out.print(mass[j]);
            } else {
                System.out.print(mass[j] + ", ");
            }
        }

        System.out.println();

        int maxElement = mass[0];
        int minElement = mass[0];

        for (int i = 0; i < mass.length; i++) {

            if (mass[i] > maxElement) {
                maxElement = mass[i];
            }
            if (mass[i] < minElement) {
                minElement = mass[i];
            }
        }

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == maxElement) {
                mass[i] = minElement;
            } else if (mass[i] == minElement) {
                mass[i] = maxElement;
            }
        }

        System.out.println();
        System.out.println("Содержимое массива после замены ");

        for (int j = 0; j < mass.length; j++) {
            if (j == mass.length - 1) {
                System.out.print(mass[j]);
            } else {
                System.out.print(mass[j] + ", ");

            }
        }
        System.out.println();


    }
}