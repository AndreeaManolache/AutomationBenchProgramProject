package academy.learnprogramming;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userChoice = " ";

        while (!userChoice.equals("q")) {
//        while (!(userChoice.equals("q") || userChoice.equals("Q"))) {

            System.out.println("Please choose one of the following options");
            System.out.println("1 - Cappucino");
            System.out.println("2 - Latte");
            System.out.println("3 - Americano");
            System.out.println("4 - Mocha");
            System.out.println("5 - Macchiato");
            System.out.println("6 - Espresso");
            System.out.println("Q - Quit the program");

            userChoice = scanner.nextLine();

            userChoice = userChoice.toLowerCase();
            System.out.println("You chose " + userChoice);
        }

        scanner.close();
    }
}
