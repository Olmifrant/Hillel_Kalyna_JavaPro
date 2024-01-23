package ua.hillel.kalina.lessons.lesson_012;


public class Main {

    public static void main(String[] args) throws MyNumberFormatException   {


        //String str = args[0];

        String str = "314158261";

        check(str);

        char[] chars = str.toCharArray();

        int[] ints = new int[str.length()];

        for (int i = 0; i < chars.length; i++) {
            ints[i] = Integer.parseInt(String.valueOf(chars[i]));
        }

        Fonts fonts = new Fonts();

        for (int b = 0; b < ints.length; b++) {

            switch (ints[b]) {
                case 0:fonts.output(fonts.nul()); break;
                case 1:fonts.output(fonts.one()); break;
                case 2:fonts.output(fonts.two()); break;
                case 3:fonts.output(fonts.three()); break;
                case 4:fonts.output(fonts.four()); break;
                case 5:fonts.output(fonts.five()); break;
                case 6:fonts.output(fonts.six()); break;
                case 7:fonts.output(fonts.seven()); break;
                case 8:fonts.output(fonts.eight()); break;
                case 9:fonts.output(fonts.nine()); break;
            }
        }

        System.out.println();
        ptint(fonts.rezult);

    }

    public static void  check(String el) throws MyNumberFormatException {

        char[] chs = el.toCharArray();

        for (int v = 0; v < chs.length ;v++) {
            try {
                int i1 = Integer.parseInt(String.valueOf(chs[v]));
            } catch (NumberFormatException e) {
                throw new MyNumberFormatException(chs[v]);
            }
        }
    }

    public static void ptint(String[] string) {

        for (int i = 0; i < string.length; i++) {
                System.out.println(string[i]);
        }
    }
}
