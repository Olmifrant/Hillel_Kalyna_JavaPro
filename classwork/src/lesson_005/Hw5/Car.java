package lesson_005.Hw5;

public class Car {

    public static void main(String[] args) {

        start();

    }
    private static void start(){

        System.out.println("Старт");

        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private static void startElectricity(){
        System.out.println("запуск электроники");

    }

    private static void startCommand(){
        System.out.println("запуск управления");
    }

    private static void startFuelSystem(){
        System.out.println("запуск топливной системы");
    }



}
