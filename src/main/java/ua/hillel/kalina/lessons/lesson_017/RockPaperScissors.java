package ua.hillel.kalina.lessons.lesson_017;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {


        System.out.println("Добро пожаловать в игру Камень, Ножницы, Бугага!");
        System.out.println("Введите ваше имя: ");

        Scanner scName = new Scanner(System.in);
        String playerName = scName.nextLine();

        System.out.print(playerName + " введите количество игр: ");
        Scanner numGame = new Scanner(System.in);
        int totalGames = 0;
        while (true) {
            if (numGame.hasNextInt()) {
                totalGames = numGame.nextInt();
                numGame.nextLine();
                 if (totalGames >= 1) {
                break;
                 } else {
                System.out.println("Выберите вариант из списка пожалуйста!");
                }
            } else {
                System.out.println("Только цифры пожалуйста!");
                numGame.nextLine();
            }
        }


        int gamesPlayed = 0;
        int playerWins = 0;
        int computerWins = 0;

        while (gamesPlayed < totalGames) {

            System.out.println();
            System.out.println("Игра: " + (gamesPlayed + 1) + "/" + totalGames);
            System.out.println(playerName+ " сделайте ваш выбор: 1 - Камень, 2 - Ножницы, 3 - Бумага, 0 - завершить игру");


            Scanner scan = new Scanner(System.in);
            int playerChoice = 0;
            while (true) {
                if (scan.hasNextInt()) {
                    playerChoice = scan.nextInt();
                    scan.nextLine();
                    if (playerChoice >= 0 && playerChoice <= 3) {
                        break;
                    } else {
                        System.out.println("Выберите вариант из списка пожалуйста!");
                    }
                } else {
                    System.out.println("Только цифры пожалуйста!");
                    scan.nextLine();
                }
            }

            if (playerChoice == 0) {
                break;
            } else {

                Random random = new Random();
                int computerChoice = random.nextInt(3) + 1;

                System.out.println("Выбор " + playerName + ": " + getChoiceName(playerChoice));
                System.out.println("Выбор системы: " + getChoiceName(computerChoice));

                int result = determineWinner(playerChoice, computerChoice);
                if (result == 1) {
                    System.out.println("Побеждает " + playerName );
                    playerWins++;
                } else if (result == -1) {
                    System.out.println("Побеждает система");
                    computerWins++;
                } else {
                    System.out.println("Ничья!");
                }

                gamesPlayed++;
            }

        }


        System.out.println("\nИгра окончена.");
        System.out.println("Всего игр: " + gamesPlayed);
        System.out.println("Побед " + playerName + ": " + playerWins);
        System.out.println("Побед системы: " + computerWins);
        System.out.println("В ничью: " + (totalGames - playerWins - computerWins));
    }

    private static String getChoiceName(int choice) {
        switch (choice) {
            case 1:return "Камень";
            case 2:return "Ножницы";
            case 3:return "Бумага";
            default:return "";
        }
    }

    static int determineWinner(int playerChoice, int computerChoice) {
        if (playerChoice == computerChoice) {
            return 0;
        } else if ((playerChoice == 1 && computerChoice == 2) ||
                (playerChoice == 2 && computerChoice == 3) ||
                (playerChoice == 3 && computerChoice == 1)) {
            return 1;
        } else {
            return -1;
        }
    }

}
