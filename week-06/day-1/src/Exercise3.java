import java.util.Arrays;
import java.util.List;

public class Exercise3 {
    //    Write a Stream Expression to find which number squared value is more then 20 from the following list:
//
//    List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        numbers.stream()
                .filter(n -> n * n > 20)
                .forEach(System.out::println);
    }
}
