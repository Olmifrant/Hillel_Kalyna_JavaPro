package lesson_009;

import java.util.*;

public class Hw11_04 {

    public static void main(String[] args) {

        ArrayList <String> list1 = new ArrayList<>();

        int size = 100;
        for (int i = 0; i < size ; i++) {
            int n = (int) ((Math.random() * 5) +1);
            switch (n){
                case 1: list1.add("Кот"); break;
                case 2: list1.add("Пес"); break;
                case 3: list1.add("Лис"); break;
                case 4: list1.add("Ёж"); break;
                case 5: list1.add("Гусь"); break;
            }
        }
        calcOccurance(list1);
    }

    public static void calcOccurance (List list){

        Set<String> set = new HashSet<>(list);
        ArrayList<String> setUni = new ArrayList<>(set);

        String[] uniqList = new String[set.size()];
        for (int i = 0; i < uniqList.length ; i++) {
            uniqList[i]= setUni.get(i);
        }

        String[] any = new String[list.size()];
        for (int i = 0; i < any.length ; i++) {
            any[i] = list.get(i).toString();
        }

        System.out.println("Полный список " + Arrays.toString(any));
        System.out.println("Уникальный список " + Arrays.toString(uniqList));

        for (int i = 0; i <uniqList.length ; i++) {
            int count = 0;
            for (int j = 0; j < any.length ; j++) {
                if (uniqList[i].equals(any[j])){
                    count++;
                }
            }
            System.out.println("Значение " + uniqList[i] + " повторяется " + count + " раз");
        }
    }
}
