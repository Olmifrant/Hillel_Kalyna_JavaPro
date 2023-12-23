package lesson_0088;

public class MyArrayList<T> {

    private final int INIT_SIZE = 2;
    private final int CUT_RATE = 2;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;
    private int index = 0;

    //    public MyArrayList(Object[] array, int index) {
//       // this.array = array;
//        //this.index = index;
//    }
//


    public int getINIT_SIZE() {
        return INIT_SIZE;
    }

    public int getCUT_RATE() {
        return CUT_RATE;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public int getPointer() {
        return pointer;
    }

    public void setPointer(int pointer) {
        this.pointer = pointer;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Object addValue(int index, String value) {


        int n = array.length;
        Object[] newArray = new Object[n + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = value;
        for (int i = index + 1; i <= n; i++) {
            newArray[i] = array[i - 1];
        }

        return array = newArray;
    }








    public void add( T item) {
        if (pointer == array.length )
            resize(array.length * 2); // увеличу в 2 раза, если достигли границ
        array[pointer++] = item;
        //System.out.println("massLenght = " + array.length);

    }

    public void print (T item) {
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

    public T get(int index) {
        return (T) array[index];
    }

    /*
    Удаляет элемент списка по индексу. Все элементы справа от удаляемого
    перемещаются на шаг налево. Если после удаления элемента количество
    элементов стало в CUT_RATE раз меньше чем размер внутреннего массива,
    то внутренний массив уменьшается в два раза, для экономии занимаемого
    места.
    */
    public void remove(int index) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i + 1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length / 2); // если элементов в CUT_RATE раз меньше чем
        // длина массива, то уменьшу в два раза
    }

    /*Возвращает количество элементов в списке*/
    public int size() {
        return pointer;
    }

    /*Вспомогательный метод для масштабирования.*/
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

}