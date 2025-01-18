package game;

import java.util.Scanner;

public class GuessGame {

    public void guess() {

        int numberToGuess = (int) (Math.random() * 10) + 1;
        boolean guessed = false;


        int totalTries = 3;
        String feedback = "Number High or Low";


        System.out.println("Number to guess = " + numberToGuess + "!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 10");

        while (!guessed) {
            System.out.println("Enter your guess: ");
            int usersGuess = scanner.nextInt();

            if (usersGuess == numberToGuess) {
                System.out.println("You guessed it!");
                guessed = true;
            }
        }
    }
}
