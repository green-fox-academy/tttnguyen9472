import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number and the user has to figure it out
        // The user can input guesses
        // After each guess the program would tell one of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        int storedNumber = 8;
        System.out.println("Please guess a number!");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        while (!(storedNumber == guess)) {
            if (storedNumber > guess) {
                System.out.println("The stored number is higher.");
            } else if (storedNumber < guess) {
                System.out.println("The stored number is lower.");
            } else if (storedNumber == guess) {
                System.out.println("You found the number: " + storedNumber);
            }
        }

    }
}
