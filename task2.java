import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        // Initialize the number of attempts
        int attempts = 0;
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Initialize the user's guess
        int guess = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        System.out.println("Try to guess it!");

        // Continue looping until the user guesses the correct number
        while (guess != randomNumber) {
            // Prompt the user to enter a guess
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            // Increment the number of attempts
            attempts++;

            // Provide feedback to the user
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}


