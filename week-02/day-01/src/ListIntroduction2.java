import java.util.ArrayList;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {

        //Create a list ('List A') which contains the following values
        // Apple, Avocado, Blueberries, Durian, Lychee
        List<String> ListA = new ArrayList<>();
        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");
        System.out.println(ListA);

        //Create a new list ('List B') with the values of List A
        List<String> ListB = new ArrayList<>();
        ListB = ListA;
        System.out.println(ListB);

        //Print out whether List A contains Durian or not
        boolean durian = ListA.contains("durian");
        System.out.println(durian);

//        Remove Durian from List B
//        Add Kiwifruit to List A after the 4th element
//        Compare the size of List A and List B
//        Get the index of Avocado from List A
//        Get the index of Durian from List B
//        Add Passion Fruit and Pomelo to List B in a single statement
//        Print out the 3rd element from List A

    }
}
