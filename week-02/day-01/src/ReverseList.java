public class ReverseList {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `numbers`
        // - Print the elements of the reversed `numbers`


        //1 element - 1 loop
        //2 element - 1 loop
        //3 element - 1 loop
        //4 element - 2 loop
        //5 element - 2 loop
        //6 element - 3 loop

        //{3, 4, 5, 6}
        // we need a loop, the elements size should be divided by 2
        // 3 change place with 6
        // 4 change place with 5
        int[] numbers = {3, 4, 5, 6, 7};
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[0];
            numbers[0] = numbers[4];
            numbers[4] = temp

        }
        System.out.println(numbers.toString());
        }
    }
}
