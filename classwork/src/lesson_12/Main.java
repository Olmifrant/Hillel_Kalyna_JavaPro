package lesson_12;


public class Main {


    public static void main(String[] args) {

        Fonts fonts = new Fonts();

        String str = "012344444587487445008816789";

        char[] chars = str.toCharArray();

        int[] ints = new int[str.length()];

        for (int i = 0; i < chars.length; i++) {
            ints[i] = Integer.parseInt(String.valueOf(chars[i]));
        }


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
                case 9: fonts.output(fonts.nine()); break;

            }

        }


        System.out.println();
        ptint(fonts.rezult);


    }

//    public static boolean check(String el) {
//
//        char[] chs = el.toCharArray();
//
//        for (int i = 0; i < chs.length; i++) {
//            try {
//                int i1 = Integer.parseInt(String.valueOf(chs[i]));
//                {
//                    return true;
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Так себе число.");
//            }
//
//            //Integer.parseInt(String.valueOf(chs[i]))
//        }
//        return false;
//
//    }

    public static void ptint(String[] string) {


        for (int i = 0; i < string.length; i++) {
            if (i == string.length - 1) {
                System.out.println(string[i]);
            } else {
                System.out.println(string[i]);
            }
        }
    }

}
