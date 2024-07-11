package ua.hillel.kalina.lessons.Lesson_ets;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        int x, y;
        String direction, result = "";

        String[] inputValues = readInput();
        x = Integer.parseInt(inputValues[0]);
        y = Integer.parseInt(inputValues[1]);
        direction = inputValues[2];


        int a = 0;
        int b = 0;

        switch (direction){
            case "down": a = x; b = y + 1;  break;
            case "left": a = x - 1; b = y; break;
            case "right": a = x + 1; b = y; break;
            case "up": a = x; b = y - 1; break;
        }

        if (a <= 100){
            a = a;

        }else {
            a = 100;
        }

        if (a >= 0) {
            a = a;
        }else {
            a=0;
        }

        if (b <= 100){
            b = b;

        }else {
            b = 100;
        }

        if (b >= 0) {
            b = b;
        }else {
            b=0;
        }

        result = "x: " + a  + ", y: " + b + ", direction: " + direction;
        System.out.println(result);
    }

    public static String[] readInput() {
        String[] inputValues = new String[3];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            for (int i = 0; i < 3; i++) {
                inputValues[i] = values[i];
            }
        }
        scanner.close();

        return inputValues;



    }
}
