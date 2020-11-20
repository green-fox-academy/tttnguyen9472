public class DrawDiagonal {
    public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %%  %
    // % % %
    // %  %%
    // %%%%%
    //
    // The square should have as many lines as the number was

        int a = 6;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j) {
                    System.out.print("%");
                }
                else if (i == 0 || i == a - 1) {
                    System.out.print("%");
                }
                else if (j == 0 || j == a - 1) {
                    System.out.print("%");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}