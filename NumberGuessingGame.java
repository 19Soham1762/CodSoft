import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        final int MAX_ATTEMPTS = 5;
        final int LOWER_BOUND = 1;
        final int UPPER_BOUND = 100;

        int score = 0;
        boolean keepPlaying = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (keepPlaying) {
            int targetNumber = random.nextInt(UPPER_BOUND - LOWER_BOUND + 1) + LOWER_BOUND;
            int attempts = 0;
            boolean isGuessed = false;

            System.out.println("\nI'm thinking of a number between " + LOWER_BOUND + " and " + UPPER_BOUND + ".");
            System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess it!");

            while (attempts < MAX_ATTEMPTS) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("That's right! You guessed it in " + attempts + " attempt(s).");
                    score++;
                    isGuessed = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Oops, your guess is too low.");
                } else {
                    System.out.println("Oops, your guess is too high.");
                }

                System.out.println("Attempts left: " + (MAX_ATTEMPTS - attempts));
            }

            if (!isGuessed) {
                System.out.println("You've used all your attempts! The correct number was: " + targetNumber);
            }

            // Ask the user if they want to play again
            System.out.print("\nWant to play another round? (yes/no): ");
            sc.nextLine();  
            String response = sc.nextLine().trim().toLowerCase();

            if (!response.equals("yes")) {
                keepPlaying = false;
            }
        }

        System.out.println("\nGame Over! You won " + score + " round(s).");
        sc.close();
    }
}
