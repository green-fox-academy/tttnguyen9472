import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonalFinance {
    public static void main(String[] args) {
//        We are going to represent our expenses in a list containing integers.
//
//        Create a list with the following items.
//        500, 1000, 1250, 175, 800 and 120
//        Create an application which solves the following problems.
//        How much did we spend?
//                Which was our greatest expense?
//        Which was our cheapest spending?
//                What was the average amount of our spendings?

        List<Integer> finance = Arrays.asList(500, 1000, 1250, 175, 800, 120);
        int sum = 0;
        for (int i = 0; i < finance.size(); i++) {
            sum += finance.get(i);
        }
        System.out.println("Spent money: " + sum);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < finance.size(); i++) {
            if (finance.get(i) > max) {
                max = finance.get(i);
            }
        }
        System.out.println("Greatest expense: " + max);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < finance.size(); i++) {
            if (finance.get(i) < min) {
                min = finance.get(i);
            }
        }
        System.out.println("Cheapest spending: " + min);

        System.out.println("Average amount of spending: " + sum / finance.size());
    }

}

