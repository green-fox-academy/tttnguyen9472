import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
//    Write a Stream Expression to concatenate a
//    Character list to a string!

    public static void main(String[] args) {
        List<Character> chars = Arrays.asList('K', 'I', 'T', 'T', 'E', 'N', '.');
        String charsAsString = chars.stream()
                .map(character -> character.toString())
                .collect(Collectors.joining());
        System.out.println(charsAsString);
    }

}
