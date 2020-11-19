public class secondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int a = 24 * 60 * 60;
        int b = currentHours * 60 * 60;
        int c = currentMinutes * 60;

        System.out.println(a - (b + c + currentSeconds));
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
    }
}
