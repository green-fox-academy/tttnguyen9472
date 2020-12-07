public class Power {
    // Given base and n that are both 1 or more, compute recursively (no loops) the
    // value of base to the n power, so powerN(3, 2) is 9 (3 squared).

    private static int powerN(int base, int n){
        if (n < 1 || base < 1) {
            return 1;
        } return base * powerN(base, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(powerN(3, 3));
    }
}
