package lesson_003;

public class Hw3_01 {

    public static void main(String[] args) {

        //За допомогою циклу for вивести на екран непарні числа від 1 до 99

        System.out.println();
        System.out.println("Нечетные числа числа от 1 до 99 ");

        for (int j = 0; j < 100; j++) {
            if (j % 2 == 0 ){
                continue;

            }
            System.out.print(j + " ");
        }

        System.out.println();

    }
}