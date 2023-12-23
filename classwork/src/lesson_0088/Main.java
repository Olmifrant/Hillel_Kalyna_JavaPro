package lesson_0088;

public class Main {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        System.out.println(myArrayList.getArray().length);

        int a =0;
        int count =0;
        for (int i = 0; i < 5 ; i++) {
            double  c  = (Math.random() *100) ;
            myArrayList.add(i);
            //myArrayList.add(i, i);
            a = a + count;
            count++;
        }


        myArrayList.print(myArrayList);
        myArrayList.addValue(10,"100");
        myArrayList.print(myArrayList);
        myArrayList.remove(2);
        myArrayList.print(myArrayList);
        myArrayList.add("500");
        myArrayList.add("111");
        myArrayList.add("741");
        myArrayList.add("444");
        myArrayList.print(myArrayList);
        System.out.println(myArrayList.get(10));












    }


}



