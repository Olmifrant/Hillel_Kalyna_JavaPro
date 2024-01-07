package lesson_008;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class CollectionImpl implements Collection {

    final int INIT_SIZE = 2;
    final int CUT_RATE = 2;
    int pointer = 0;
    Object[] array = new Object[INIT_SIZE];


    @Override
    public boolean print() {

        System.out.println(Arrays.toString(array));
        return true;
    }

    public boolean addValue(String o) {
        if (pointer == array.length)
            resize(array.length * 2);
        array[pointer++] = o;
        return true;
    }

    @Override
    public boolean addIndexAndValue(int index, String o) {

        if (array.length < index) {
            System.out.println("Невозможно использовать ячейку " + index + " поскольку текущая длина массива " + array.length);
        } else {
            String[] newArray = new String[array.length + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = (String) array[i];
            }
            newArray[index] = o;
            for (int i = index + 1; i <= array.length; i++) {
                newArray[i] = (String) array[i - 1];
            }
            array = newArray;
        }
        return true;
    }

    @Override
    public boolean delete(String o) {

        int z = -1;
        for (int i = 0; i < array.length ; i++) {
            if (o.equals(array[i])) {
                z = i;
            }
        }

        if (z >= 0) {
            if (array.length > (z +1) ) {
                for (int i = z; i < pointer; i++)
                    array[i] = array[i + 1];
                array[pointer] = null;
                pointer--;
                System.out.println("Значение ячейки " + z + " успешно удалено");
                if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
                    resize(array.length / 2);
            } else {
                array[z] = null;
                pointer--;
                System.out.println("Значение ячейки " + z + " успешно удалено");
            }
        } else {
            System.out.println("В коллекции нет таких значений");
        }
        return true;
    }

    @Override
    public String getIndex(int index) {

        if (index <= pointer) {
            System.out.println("Ячейка " + index + " содержит значение " + array[index]);
        } else {
            System.out.println("Невозможно вывести значение ячейки " + index + " поскольку текущий размер коллекции " + pointer);
        }
        return "Some";
    }

    @Override
    public boolean contain(String o) {

        int z = -1;
        for (int i = 0; i < pointer ; i++) {
            if (o.equals(array[i])) {
                z = i;
            }
        }
        if (z >= 0) {
            System.out.println("Значение " + o + " обнаружено в ячейке " + z );
        } else {
            System.out.println("В коллекции нет таких значений");
        }
        return true;
    }

    @Override
    public boolean  equals (String[] str) {

        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < str.length ; j++) {
                if (array[i] == null ||  str[j] == null) {
                    continue ;
                }
                if (array[i].equals(str[j])) {
                    System.out.println("Совпало значение  " + array[i]);
                    count++;
                }
            }
        }
        System.out.println("Всего совпадений  " + count );
        return false;
    }

    @Override
    public boolean clear() {

        Object[] arr = new Object[1];
        arr[0] = null;
        array = arr;
        pointer = 0;
        return true;
    }

    @Override
    public int size() {
        System.out.println("Размер коллекции в данный момент " + pointer );
        return pointer;
    }

    private void resize(int newLength) {
        String[] newArray = new String[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
