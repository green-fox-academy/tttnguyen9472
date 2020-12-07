import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
//    Create a list ('List A') which contains the following values
//
//    Apple, Avocado, Blueberries, Durian, Lychee
//
//    Create a new list ('List B') with the values of List A
//    Print out whether List A contains Durian or not
//    Remove Durian from List B
//    Add Kiwifruit to List A after the 4th element
//    Compare the size of List A and List B
//    Get the index of Avocado from List A
//    Get the index of Durian from List B
//    Add Passion Fruit and Pomelo to List B in a single statement
//    Print out the 3rd element from List A

        List<String> ListA = new ArrayList<>();
        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");

        List<String> ListB = new ArrayList<>();
        ListB = ListA;

        System.out.println(ListA.contains("Durian"));

        ListB.remove("Durian");
        System.out.println(ListB);

        ListA.add(4, "Kiwifruit");
        System.out.println(ListA);

        System.out.println("The size of List A is " + ListA.size());
        System.out.println("The size of List B is " + ListB.size());

        System.out.println(ListA.indexOf("Avocado"));
        System.out.println(ListB.indexOf("Durian"));


    }
}

