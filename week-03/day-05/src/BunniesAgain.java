public class BunniesAgain {
    // We have bunnies standing in a line,
    // numbered 1, 2, 3, 4, ...
    // The odd bunnies (1, 3, ...) have the normal 2 ears.
    // The even bunnies (2, 4, ..) we'll say have 3 ears,
    // because they each have a raised foot.
    // Recursively return the number of "ears" in
    // the bunny line 1, 2, ... n (without loops or multiplication).

    public static int earCount(int bunnies) {
        if (bunnies == 1) {
            return 2;
        } else {
            if (bunnies % 2 == 0) {
                return earCount(bunnies - 1) + 3;
            } else {
                return earCount(bunnies - 1) + 2;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(earCount(3));
    }
}
