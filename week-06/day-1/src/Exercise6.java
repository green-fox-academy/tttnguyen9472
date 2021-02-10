import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
//    Write a Stream Expression to find the
//    uppercase characters in a string!

    public static void main(String[] args) {
        String input = "MyUpperCaseString";
        List<Character> charList = input.chars()
                .mapToObj(e -> (char)e)
                .collect(Collectors.toList());
        List<Character> upperCaseCharList = charList.stream()
                .filter(Character::isUpperCase)
                .collect(Collectors.toList());
        for (Character c : upperCaseCharList) {
            System.out.println(c);
        }
    }
}
