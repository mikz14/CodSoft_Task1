/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codsoft_task1;

/**
 *
 * @author haris
 */
import java.util.Random;
import java.util.Scanner;

public class CodSoft_Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int numberOfAttempts = 10;
        int rounds = 0;
        int score = 0;

        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Welcome to Guess The Number Game!");
            int targetNumber = rand.nextInt(101);
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("Guess a number between 1 and 100.");

            while (attempts < numberOfAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.\n");
                    score += numberOfAttempts - attempts;
                    guessedCorrectly = true;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + targetNumber + "\n");
            }

            rounds++;

            System.out.print("Do you want to play again? (Press Y to continue or any other key to exit): ");
            String playAgainResponse = scanner.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");

            System.out.println();
        }

        System.out.println("The game has ended! Your total score is: " + score + " in " + rounds + " round/s.");
        scanner.close();
    }
}
