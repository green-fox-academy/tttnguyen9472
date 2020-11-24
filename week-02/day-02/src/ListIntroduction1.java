import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {
    public static void main(String[] args) {
        //We are going to play with lists. Feel free to use the built-in methods where possible.

        //Create an empty list which will contain names (strings)
        List<String> names = new ArrayList<String>();

        //Print out the number of elements in the list
        System.out.println(names.size());

        // Add William to the list
        names.add("William");

        //Print out whether the list is empty or not
        boolean empty = names.isEmpty();

        if (empty) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("The list is not empty.");
        }

        //Add John to the list
        //Add Amanda to the list
        names.add("John");
        names.add("Amanda");

        //Print out the number of elements in the list
        System.out.println(names.size());

        //Print out the 3rd element
        System.out.println(names.get(2));

        //Iterate through the list and print out each name
        //  William
        //  John
        //  Amanda
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(names);

        //Iterate through the list and print
        //  1. William
        //  2. John
        //  3. Amanda


        //Remove the 2nd element
        names.remove(1);
        System.out.println(names);

        //Iterate through the list in a reversed order and print out each name
        //  Amanda
        //  William


        //Remove all elements
        names.clear();
        System.out.println(names);
    }
}

