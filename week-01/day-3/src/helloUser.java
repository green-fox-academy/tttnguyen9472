import java.util.Scanner;

public class helloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String userInput1 = scanner.nextLine();
        System.out.println("Hello, " + userInput1 + "!");

    }
}
