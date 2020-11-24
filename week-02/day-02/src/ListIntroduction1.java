import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {
    public static void main(String[] args) {
        //We are going to play with lists. Feel free to use the built-in methods where possible.
        //Create an empty list which will contain names (strings)
        //Print out the number of elements in the list
        // Add William to the list
        //Print out whether the list is empty or not
        //Add John to the list
        //Add Amanda to the list
        //Print out the number of elements in the list
        //Print out the 3rd element
        //Iterate through the list and print out each name
        //  William
        //  John
        //  Amanda
        //Iterate through the list and print
        //  1. William
        //  2. John
        //  3. Amanda
        //Remove the 2nd element
        //Iterate through the list in a reversed order and print out each name
        //  Amanda
        //  William
        //Remove all elements


        List<String> names = new ArrayList<String>();

        System.out.println(names.size());

        names.add("William");

        boolean empty = names.isEmpty();

        if (empty) {
            System.out.println("The list is empty.");
        }
        else {
            System.out.println("The list is not empty.");
        }
        names.add("John");
        names.add("Amanda");

        System.out.println(names.size());

        System.out.println(names.get(2));

        System.out.println(names);

        names.remove(1);
        System.out.println(names);
    }
}
