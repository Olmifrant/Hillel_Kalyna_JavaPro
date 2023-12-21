package lesson_002;

public class Hw2_03 {

    public static void main(String[] args) {


        System.out.println();
        System.out.println("Deposit Calculator");

        double summ = Double.parseDouble(args[0]);
        double per = Double.parseDouble(args[1]);
        double dur = Double.parseDouble(args[2]);


        System.out.println();
        System.out.println("Cумма вклада " + summ + " UAH");
        System.out.println("Процентная ставка " + per + " % годовых");
        System.out.println("Cрок вклада " + dur + " лет");


        System.out.println();
        double balanse = 0;
        for (int year = 1; year <= dur; year++) {
            balanse = summ * Math.pow(1 + (per/100), year);
            System.out.println("Баланс за " + year + " год " + "составляет " + balanse + " UAH" + " проценты " +
                    (balanse - summ) + " UAH");

        }


    }
}



