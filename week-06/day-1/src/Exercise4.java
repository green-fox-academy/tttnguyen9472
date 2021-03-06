import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Exercise4 {
//    Write a Stream Expression to get the average value of the odd numbers from the following list:
//
//    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        OptionalDouble average = numbers.stream()
                .filter(n -> n % 2 == 1)
                .mapToDouble(n -> n)
                .average();
        if (average.isPresent()){
            System.out.println(average);
        } else {
            System.out.println("NaN");
        }
    }
}
