import java.util.HashMap;

public class MapIntroduction1 {
// We are going to play with maps. Feel free to use the built-in methods where possible.
//
// Create an empty map where the keys are integers and the values are characters
//
// Print out whether the map is empty or not
//
//  Add the following key-value pairs to the map
//    Key 	Value
//    97 	a
//    98 	b
//    99 	c
//    65 	A
//    66 	B
//    67 	C
//
//  Print all the keys
//
//  Print all the values
//
//  Add value D with the key 68
//
//  Print how many key-value pairs are in the map
//
//  Print the value that is associated with key 99
//
//  Remove the key-value pair where with key 97
//
//  Print whether there is an associated value with key 100 or not
//
//  Remove all the key-value pairs

    public static void main(String[] args) {
        HashMap<Integer, Character> hashMap = new HashMap<>();

        System.out.println(hashMap.isEmpty());

        hashMap.put(97, 'a');
        hashMap.put(98, 'b');
        hashMap.put(99, 'c');
        hashMap.put(65, 'A');
        hashMap.put(66, 'B');
        hashMap.put(67, 'C');

        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());

        hashMap.put(68, 'D');

        System.out.println(hashMap.size());

        System.out.println(hashMap.get(99));

        hashMap.remove(97);

        System.out.println(hashMap.containsKey(100));

        hashMap.remove(98, 'b');
        hashMap.remove(99, 'c');
        hashMap.remove(65, 'A');
        hashMap.remove(66, 'B');
        hashMap.remove(67, 'C');
        hashMap.remove(68, 'D');

        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
    }
}
