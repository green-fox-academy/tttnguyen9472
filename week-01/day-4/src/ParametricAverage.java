import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4
        Scanner scanner = new Scanner(System.in);
        long guess = scanner.nextInt();
        long integerValue = 0;
        long sum = 0;
        long average = 0;
        for (int i = 0; i < guess; i++) {
            System.out.println("Please enter an integer!");
            integerValue = scanner.nextInt();
            sum = sum + integerValue;
        }
        average = sum / guess;
        System.out.println("Sum: " + sum + " Average: " + average);
    }


}
