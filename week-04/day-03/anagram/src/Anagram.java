import java.util.HashMap;
import java.util.Map;

public class Anagram {
    //    Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
    //    Create a test for that.
    public static boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (!map.containsKey(word.charAt(i)))
                map.put(word.charAt(i), 1);
            else
                map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
        }

        for (int i = 0; i < anagram.length(); i++) {
            if (!map.containsKey(anagram.charAt(i)))
                return false;
            else if (map.get(anagram.charAt(i)) >= 1)
                map.put(anagram.charAt(i), map.get(anagram.charAt(i)) - 1);
            else
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("cat", "god"));
    }
}
