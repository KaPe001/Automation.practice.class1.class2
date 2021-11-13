package class1;

import java.util.Random;
import java.util.Scanner;

public class guessGame {

    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(100);
        System.out.println("Guess the integer number from 0 to 99: . You have 5 guesses.");

        Scanner sc = new Scanner(System.in);
        int numberOfGuesses = 5;

        for (int i = 1; i <= numberOfGuesses; i++) {
            int userGuess = sc.nextInt();
            if ((i == 5) && (userGuess != numberToGuess)) {
                System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
            } else if (userGuess > numberToGuess) {
                System.out.println("Your number is GREATER than the one trying to guess. Guess the integer number between 0 and 99.");
                System.out.println("Please try again. You have " + (numberOfGuesses - i) + " guesses left.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Your number is LOWER than the one you are trying to guess. Guess the integer number between 0 and 99.");
                System.out.println("Please try again. You have " + (numberOfGuesses - i) + " guesses left.");
            } else {
                System.out.println("You guessed it!");
                break;
            }
        }
        sc.close();
    }
}
