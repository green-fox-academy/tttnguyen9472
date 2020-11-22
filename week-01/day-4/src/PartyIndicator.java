import java.util.Scanner;

public class PartyIndicator<sausageParty> {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is excellent!
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        //
        // It should print: Quite cool party!
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people
        Scanner scanner = new Scanner(System.in);
        long girls = (long) scanner.nextInt();
        long boys = (long) scanner.nextInt();

        boolean goodRatio = (girls == boys);
        boolean goodNumber = (girls + boys >= 20);
        boolean sausageParty = (girls == 0);

        if (goodRatio && goodNumber) {
            System.out.println("The party is excellent!");
        } else if (goodNumber && !sausageParty) {
            System.out.println("Quite cool party!");
        } else if (!goodNumber && !sausageParty) {
            System.out.println("Average party...");
        } else {
            System.out.println("Sausage party");
        }
    }
}
