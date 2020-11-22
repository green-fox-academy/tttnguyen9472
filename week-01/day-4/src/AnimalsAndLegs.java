import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);
        int numChicken = scanner.nextInt();
        int numPig = scanner.nextInt();
        int sum = 0;
        sum = numChicken * 2 + numPig * 4;
        System.out.println("The number of all the legs are: " + sum);

    }
}
