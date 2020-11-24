import java.util.Arrays;
import java.util.Comparator;

public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders`

        String[] orders = new String[] {"first", "second", "third"};
        Arrays.sort(orders, 0, 3, Comparator.comparing(String::toString).reversed());
        System.out.println(Arrays.toString(orders));
    }
}

