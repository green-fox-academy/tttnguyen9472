import java.util.ArrayList;
import java.util.List;

public class Sum {
//- Create a sum method in your class which has an ArrayList of Integers as
//            parameter
//- It should return the sum of the elements in the list
//- Follow these steps:
//            - Add a new test case
//            - Instantiate your class
//  - create a list of integers
//  - use the `assertEquals` to test the result of the created sum method
//- Run them
//- Create different tests where you test your method with:
//            - an empty list
//  - a list that has one element in it
//  - a list that has multiple elements in it
//  - a `null`
//            - Run them
//- Fix your code if needed

    public static Integer sumList(List<Integer> list) {
        Integer sum = 0;

        for (Integer number : list)
            sum = sum + number;

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(sumList(list));
    }

}
