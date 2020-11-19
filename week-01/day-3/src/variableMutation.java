public class variableMutation {
    public static void main(String[] args) {
        int a = 3;
        a = a + 10;
        // make the "a" variable's value bigger by 10

        System.out.println(a);

        int b = 100;
        b = b - 7;
        // make b smaller by 7

        System.out.println(b);

        int c = 44;
        c = c * 2;
        // please double c's value

        System.out.println(c);

        int d = 125;
        d = d / 5;
        // please divide by 5 d's value

        System.out.println(d);

        int e = 8;
        e = e * e * e;
        // please cube of e's value

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean f3 = f1 > f2;
        // tell if f1 is bigger than f2 (print as a boolean)

        System.out.println(f3);

        int g1 = 350;
        int g2 = 200;
        boolean g3 = (g2 * g2) > g1;
        // tell if the double of g2 is bigger than g1 (print as a boolean)

        System.out.println(g3);

        int h = 135798745;
        boolean h1 = (h % 11 == 0);
        // tell if it has 11 as a divisor (print as a boolean)

        System.out.println(h1);

        long i1 = 10;
        long i2 = 3;
        boolean i3 = i1 > (i2 * i2);
        boolean i4 = i1 < (i2 * i2 * i2);
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        System.out.println(i3);
        System.out.println(i4);

        int j = 1521;
        boolean j1 = (j % 3 == 0);
        boolean j2 = (j % 5 == 0);
        // tell if j is dividable by 3 or 5 (print as a boolean)
    }
}
