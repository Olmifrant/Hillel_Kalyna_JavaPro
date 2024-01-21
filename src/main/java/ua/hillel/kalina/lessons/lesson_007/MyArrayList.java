package ua.hillel.kalina.lessons.lesson_007;


public class MyArrayList {

    private final int INIT_SIZE = 2;
    private final int CUT_RATE = 2;
    private String[] array = new String[INIT_SIZE];
    private int count = 0;


    public void get(int index) {
        if (index <= count) {
            System.out.println("Ячейка " + index + " содержит значение " + array[index]);
        } else {
            System.out.println("Невозможно вывести значение ячейки " + index + " поскольку текущая длина массива " + array.length);
        }
    }

    public void addIndexAndValue(int index, String value) {
        int n = array.length;
        if (n < index) {
            System.out.println("Невозможно использовать ячейку " + index + " поскольку текущая длина массива " + n);
        } else {
            String[] newArray = new String[n + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = value;
            for (int i = index + 1; i <= n; i++) {
                newArray[i] = array[i - 1];
            }
            array = newArray;
        }
    }

    public void addValue(String value) {
        if (count == array.length)
            resize(array.length * 2);
        array[count++] = value;

    }

    public void print() {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    public void remove(int index) {

        if (index <= array.length) {

            for (int i = index; i < count; i++)
                array[i] = array[i + 1];
            array[count] = null;
            count--;
            System.out.println("Значение ячейки " + index + " успешно удалено");
            if (array.length > INIT_SIZE && count < array.length / CUT_RATE)
                resize(array.length / 2);
        } else {
            System.out.println("Невозможно удалить ячейку " + index + " поскольку длинны массива " + array.length);
        }

    }

    public void removeValue(String value) {


        int z = -1;
        for (int i = 0; i < array.length ; i++) {
            if (value.equals(array[i])) {
                z = i;
            }
        }
//        System.out.println("z = " + z);
//        System.out.println("pointer " + pointer);
//        System.out.println("array " + array.length);
        if (z >= 0) {
            if (array.length > (z +1) ) {
                for (int i = z; i < count; i++)
                    array[i] = array[i + 1];
                array[count] = null;
                count--;
                System.out.println("Значение ячейки " + z + " успешно удалено");
                if (array.length > INIT_SIZE && count < array.length / CUT_RATE)
                    resize(array.length / 2);
            } else {
                array[z] = null;
                count--;
                System.out.println("Значение ячейки " + z + " успешно удалено");
            }
        } else {
            System.out.println("В коллекции нет таких значений");
        }


//        int z = -1;
//
//        for (int i = 0; i < count ; i++) {
//            if (value.equals(array[i])) {
//                z = i;
//            }
//        }
//
//        if (z >= 0) {
//            for (int i = z; i < count; i++)
//                array[i] = array[i + 1];
//            array[count] = null;
//            count--;
//            System.out.println("Значение " + value + " обнаружено в ячейке " + z + " и успешно удалено");
//            if (array.length > INIT_SIZE && count < array.length / CUT_RATE)
//                resize(array.length / 2);
//
//        } else {
//            System.out.println("В массиве нет таких значений");
//        }
    }


    private void resize(int newLength) {
        String[] newArray = new String[newLength];
        System.arraycopy(array, 0, newArray, 0, count);
        array = newArray;
    }
}