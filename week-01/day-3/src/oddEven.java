import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        Scanner scanner = new Scanner(System.in);
        long userInputNumber = (long) scanner.nextInt();

        if (userInputNumber % 2 == 0) {
            System.out.println("Even");

        } else {
            System.out.println("Odd");

        }
    }
}
