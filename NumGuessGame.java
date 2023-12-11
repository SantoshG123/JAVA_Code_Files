import java.util.Random;
import java.util.Scanner;

public class UniqueNumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Number Guessing Game");

        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        System.out.println("The number is between " + lowerBound + " and " + upperBound);

        int userGuess;
        int attempts = 0;

        do {
            System.out.print("Your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < secretNumber) {
                System.out.println("Hint: Its a higher number.");
            } else if (userGuess > secretNumber) {
                System.out.println("HintL Its a lower number.");
            }

        } while (userGuess != secretNumber);

        System.out.println("You guessed the number " + secretNumber + " in " + attempts + " attempts.");
    }
}




