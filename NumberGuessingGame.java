import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        // NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1, 11);

        System.out.println("   NUMBER GUESSING GAME   ");
        System.out.println("Guess a number between 1-10 ");

        do {
            System.out.print("enter a guess :");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! TRY AGAIN");
            } else if (guess > randomNumber) {
                System.out.println("Too High! TRY AGAIN");
            } else {
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("No. of attempts : " + attempts);

            }

        } while (guess != randomNumber);
        scanner.close();

    }
}
