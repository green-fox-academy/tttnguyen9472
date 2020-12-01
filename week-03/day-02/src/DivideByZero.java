import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0

        takingANumber();

    }

    private static void takingANumber() {
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        try {
            int result = 10 / userNumber;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }


}



