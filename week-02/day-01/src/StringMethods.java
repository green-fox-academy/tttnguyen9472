public class StringMethods {
    public static void main(String[] args) {
        String s = "   wordr rjkjrkjr    ";
        String s1 = "WoRd";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        if (s1.startsWith("word")) {
            System.out.println("s1 starts with word LOLOWOLE");
        }
        if (s1.endsWith("word")) {
            System.out.println("s1 starts with word LOLOWOLE");
        }
        if (s.equalsIgnoreCase(s1)) {
            System.out.println("s1 and s are equal");
        }
        System.out.println(s.concat(s1));
        System.out.println(s.charAt(2));
        System.out.println(s.indexOf('r', 4));
        System.out.println(s.substring(3, 6));
        System.out.println(s.replace('r', 'l'));
        System.out.println(s.trim());
    }


}
