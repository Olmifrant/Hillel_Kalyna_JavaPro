package lesson_0088;

public class MyArrayList {

    private final int INIT_SIZE = 2;
    private final int CUT_RATE = 2;
    private String[] array = new String[INIT_SIZE];
    private int pointer = 0;
    private final int index = 0;


//    public int getINIT_SIZE() {
//        return INIT_SIZE;
//    }
//
//    public int getCUT_RATE() {
//        return CUT_RATE;
//    }

    public String[] getArray() {
        return array;
    }

//    public void setArray(String[] array) {
//        this.array = array;
//    }
//
//    public int getPointer() {
//        return pointer;
//    }
//
//    public void setPointer(int pointer) {
//        this.pointer = pointer;
//    }


    public void get (int index){
        System.out.println("Ячейка " + index + " содержит значение " + array[index]);

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

    public void addValue (String  value) {
        if (pointer == array.length )
            resize(array.length * 2);
        array[pointer++] = value;

    }

    public void print () {
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
        for (int i = index; i < pointer; i++)
            array[i] = array[i + 1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length / 2);

    }

    public void removeValue (String value) {




    }

    public int size () {
        return pointer;
    }

    private void resize(int newLength) {
        String[] newArray = new String[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        //System.out.println("длина массива" + array.length);
        array = newArray;
    }

    public void addIndexAndValue() {
    }
}