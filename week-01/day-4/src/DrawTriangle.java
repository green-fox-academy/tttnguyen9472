import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
//        int i = 1;
//        for (i = 1; i < 5; i++) {
//            for (int j = 1; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }


        int a = 4;
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
                System.out.println();

        }

    }

}