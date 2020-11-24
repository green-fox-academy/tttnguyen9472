import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {
    public static void main(String[] args) {
        //Create an empty map where the keys are integers and the values are characters
        Map<Integer, Character> emptyMap = new HashMap<>();

        //Print out whether the map is empty or not
        boolean empty = emptyMap.isEmpty();

        if (empty) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("The list is not empty.");
        }

        //        Add the following key-value pairs to the map
        //        Key 	Value
        //        97 	a
        //        98 	b
        //        99 	c
        //        65 	A
        //        66 	B
        //        67 	C

        Character a = 97;
        Character b = 98;
        Character c = 99;
        Character A = 65;
        Character B = 66;
        Character C = 67;

        emptyMap.put(97, a);
        emptyMap.put(98, b);
        emptyMap.put(99, c);
        emptyMap.put(65, A);
        emptyMap.put(66, B);
        emptyMap.put(67, C);

        //Print all the keys
        System.out.println(emptyMap.keySet());

        //Print all the values
        System.out.println(emptyMap.values());

        //Add value D with the key 68
        Character D = 68;
        emptyMap.put(68, D);

        //Print how many key-value pairs are in the map
        System.out.println(emptyMap.size());

        //Print the value that is associated with key 99
        System.out.println(emptyMap.get(99));

        //Remove the key-value pair where with key 97
        emptyMap.remove(97);

        //Print whether there is an associated value with key 100 or not
        if (emptyMap.containsKey(100)) {
            System.out.println(emptyMap);
        }

        //Remove all the key-value pairs
        emptyMap.clear();
        System.out.println(emptyMap);

    }
}
