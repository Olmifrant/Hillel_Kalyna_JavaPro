package ua.hillel.kalina.lessons.lesson_014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hw_017 {

    public double averageSum (List input){

        List<Integer> list = new ArrayList<>(input);
        System.out.println("Числа коллекции " + list);
        double result = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("Среднее арифметическое " + result);
        return result;
    }


    public Object filterText (String string){

        List<String> list = Arrays.stream(string.split(" "))
                .map(String::strip).filter(w -> w.equals(w.toLowerCase()) && w.length() == 4
                        && !w.contains(",") && !w.contains(".")).toList();

        System.out.println(list);

        return list;
    }




}
