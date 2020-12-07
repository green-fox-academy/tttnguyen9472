public class SumDigits {
    // Given a non-negative integer n, return the sum of it's digits recursively
    // (without loops).
    //
    // Hint
    //
    // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
    //
    // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

    private static int sumOfDigits(int n) {
        if (n <= 0) {
            return 0;
        } return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(7462462));
    }
}
// (n % 10) + ((n / 10) / 10) + (n / 10) % 10
// n = 126
// 126 % 10 = 6 -
// 126 / 10 = 12
// 12 % 10 = 2 -
// 12 / 10 = 1
// 1 % 10 = 1 -
// 1 / 10 = 0