import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelephoneBook {
// We are going to represent our contacts in a map where the keys are going to be strings and the values are going to be strings as well.
//
// Create a map with the following key-value pairs.
//    Name (key) 	Phone number (value)
//    William A. Lathan 	405-709-1865
//    John K. Miller 	402-247-8568
//    Hortensia E. Foster 	606-481-6467
//    Amanda D. Newland 	319-243-5613
//    Brooke P. Askew 	307-687-2982
//
// Create an application which solves the following problems.
// What is John K. Miller's phone number?
// Whose phone number is 307-687-2982?
// Do we know Chris E. Myers' phone number?

    public static void main(String[] args) {
        HashMap<String, String> telephoneBook = new HashMap<>();
        createMap(telephoneBook);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whose phone number would you like to have?");
        System.out.println(telephoneBook.get(scanner.nextLine()));
        System.out.println("Which number do you have?");
        System.out.println(whoseNumber(telephoneBook, scanner.nextLine()));
        System.out.println("Whose phone number would you like to know if exists?");
        System.out.println(telephoneBook.containsKey(scanner.nextLine()));
    }

    public static HashMap createMap(HashMap<String, String> telephoneBook) {
        telephoneBook.put("William A. Lathan", "405-709-1865");
        telephoneBook.put("John K. Miller", "402-247-8568");
        telephoneBook.put("Hortensia E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D. Newland", "319-243-5613");
        telephoneBook.put("Brooke P. Askew", "307-687-2982");
        return telephoneBook;
    }

    public static String whoseNumber(HashMap<String, String> telephoneBook, String number) {
        String name = "";
        for (String key : telephoneBook.keySet()) {
            String value = telephoneBook.get(key);
            if (value.equals(number)) {
                name = key;
            }
        }
        return name;
    }



}
