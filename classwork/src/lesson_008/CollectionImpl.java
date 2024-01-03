package lesson_008;

public class CollectionImpl implements Collection {

    final int INIT_SIZE = 8;
    final int CUT_RATE = 2;
    int pointer = 0;
    Object[] array = new Object[INIT_SIZE];


    @Override
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


    public void addValue(String o) {
        if (pointer == array.length)
            resize(array.length * 2);
        array[pointer ++] = o;

    }

    @Override
    public void addIndexAndValue(int index, String o) {

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
    }

    @Override
    public void delete(String o) {

        int z = -1;
        for (int i = 0; i < pointer; i++) {
            if (o.equals(array[i])) {
                z = i;
            }
        }

        if (z >= 0) {
            for (int i = z; i < pointer; i++)
                array[i] = array[i + 1];
            array[pointer] = null;
            pointer--;
            System.out.println("Значение " + o + " обнаружено в ячейке " + z + " и успешно удалено");
            if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
                resize(array.length / 2);

        } else {
            System.out.println("В массиве нет таких значений");
        }
    }

    @Override
    public void getIndex(int index) {

        if (index <= pointer) {
            System.out.println("Ячейка " + index + " содержит значение " + array[index]);
        } else {
            System.out.println("Невозможно вывести значение ячейки " + index + " поскольку текущая длина массива " + array.length);
        }

    }

    @Override
    public void contain(String o) {

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
    }

    @Override
    public boolean equals (Object coll) {

        if (array.equals(coll)) {
            System.out.println("да");

        } else {
            System.out.println("нет");
        }

        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    private void resize(int newLength) {
        String[] newArray = new String[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }


}
