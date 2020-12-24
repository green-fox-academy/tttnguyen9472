import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> animals = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "animals" list.
        // The parameter should be a list.

        System.out.println(appendA(animals));
    }

    public static List<String> appendA(List<String> animals){
        char letter = 'a';
        List<String> appendedList = new ArrayList<String>();
        for (String animal : animals) {
            appendedList.add(animal + letter);
        }
        return appendedList;
    }
}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"

