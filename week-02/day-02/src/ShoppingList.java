import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {
//  We are going to represent a shopping list in a list containing strings.
//
//  Create a list with the following items.
//    Eggs, milk, fish, apples, bread and chicken
//  Create an application which solves the following problems.
//    Do we have milk on the list?
//    Do we have bananas on the list?

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("eggs");
        shoppingList.add("milk");
        shoppingList.add("fish");
        shoppingList.add("apples");
        shoppingList.add("bread");
        shoppingList.add("chicken");
        System.out.println(shoppingList);


        System.out.println(shoppingList.contains("milk"));
        System.out.println(shoppingList.contains("bananas"));

    }
}
