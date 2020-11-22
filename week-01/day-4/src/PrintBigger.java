import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();

        if (num1 > num2) {
            System.out.println("The bigger number is: " + num1);
        }
        else {
            System.out.println("The bigger number is: " + num2);
        }
    }
}
