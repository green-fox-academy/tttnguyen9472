import java.util.Scanner;

public class mileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);
        int userInputMiles = (int) scanner.nextDouble();
        System.out.println(userInputMiles * 1.6093 + "km");
    }
}
