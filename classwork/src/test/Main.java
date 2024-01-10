package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {



//        ArrayList <String> arr = new ArrayList<>();

//        int a = 0;
//        for (int i = 0; i <= 10000 ; i++) {
//            String s = Integer.toString(a);
//            arr.add(s);
//            a++;
//
//        }
//
//
//        for (int i = 0; i < arr.size(); i++) {
//            int j =arr.size() - i -1;
//            System.out.print(arr.get(i) + ", ");
//            System.out.println (   arr.get(j) + ", ");
//
//        }






//        var str = 15;
//        var aerr = "Sred";
//
//        if ( aerr instanceof String ) {
//            System.out.println(aerr);
//        }

        List<String> stringList = new ArrayList<>();

        stringList.clear();



        if (stringList.isEmpty()) {
            System.out.println("1111");

        } else {
            System.out.println("222");
        }


        System.out.println(stringList.isEmpty());
        System.out.println(stringList.size());

        stringList.add(null);
        stringList.add("2");
        stringList.add("2");
        stringList.add("2");
        stringList.add("85");
        System.out.println(stringList);

        if (stringList.isEmpty()) {
            System.out.println("1111");

        } else {
            System.out.println("222");
        }


        stringList.removeIf(s -> "2".equals(s));


        //stringList.add( 2,null);
        System.out.println(stringList);



        
//        ArrayList numbers = new ArrayList();
//
//
//        for (int i = 0; i < str; i++)
//            numbers.add(i * 10);

//
//        int sum = 0;
//        for (int i = 0; i < 10; i++)
//        {
//            sum = sum + (Integer) numbers.get(i);
//        }
//
//
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(Integer.toString(i));
//
//        }






//        String [] Mass = new String[5];
//
//        int [] array = new int[5];
//
//        int [][]  arr = new int[10][5];



//        arr [0] [0] = 1;
//        arr [0] [1] = 2;
//        arr [0] [2] = 3;
//        arr [0] [3] = 4;
//        arr [0] [4] = 5;
//        arr [1] [0] = 6;
//        arr [1] [1] = 7;


//        int count = 1;
//        for (int i = 0; i < arr.length; i++) {
//            //arr [i] [j] = count;
//            for (int j = 0; j < arr[i].length ; j++) {
//
//                arr [i] [j] = count;
//                count++;
//
//
//            }
//
//        }

        //Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
//

//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr [i].length ; j++) {
//                for (int k = 0; k < arr[j].length ; k++) {
//                    System.out.print (arr [i]  [j] [k] + ", ");
//                }
//
//
//            }
//
//        }






    }

}
