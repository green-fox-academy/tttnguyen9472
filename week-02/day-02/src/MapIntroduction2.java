import java.util.HashMap;

public class MapIntroduction2 {
// Create a map where the keys are strings and the values are strings with the following initial values
//    Key 	Value
//    978-1-60309-452-8 	A Letter to Jo
//    978-1-60309-459-7 	Lupus
//    978-1-60309-444-3 	Red Panda and Moon Bear
//    978-1-60309-461-0 	The Lab
//
// Print all the key-value pairs in the following format
//
//    A Letter to Jo (ISBN: 978-1-60309-452-8)
//    Lupus (ISBN: 978-1-60309-459-7)
//    Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
//    The Lab (ISBN: 978-1-60309-461-0)
//
// Remove the key-value pair with key 978-1-60309-444-3
//
// Remove the key-value pair with value The Lab
//
// Add the following key-value pairs to the map
//    Key 	Value
//    978-1-60309-450-4 	They Called Us Enemy
//    978-1-60309-453-5 	Why Did We Trust Him?
//
// Print whether there is an associated value with key 478-0-61159-424-8 or not
//
// Print the value associated with key 978-1-60309-453-5

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("978-1-60309-452-8", "A Letter to Jo");
        hashMap.put("978-1-60309-459-7", "Lupus");
        hashMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        hashMap.put("978-1-60309-461-0", "The Lab");

        System.out.println(hashMap.get("978-1-60309-452-8") + "(ISBN: " + hashMap.keySet().toArray()[0] + ")");
        System.out.println(hashMap.get("978-1-60309-459-7") + "(ISBN: " + hashMap.keySet().toArray()[1] + ")");
        System.out.println(hashMap.get("978-1-60309-444-3") + "(ISBN: " + hashMap.keySet().toArray()[2] + ")");
        System.out.println(hashMap.get("978-1-60309-461-0") + "(ISBN: " + hashMap.keySet().toArray()[3] + ")");

        hashMap.remove("978-1-60309-444-");

        String keyToRemove = "";
        for (String value : hashMap.values()) {
            String key = hashMap.get(value);
            if (value.equals("The Lab")) {
                keyToRemove = key;
            }
        }
        hashMap.remove(keyToRemove);

        hashMap.put("978-1-60309-450-4", "They Called Us Enemy");
        hashMap.put("978-1-60309-453-5", "Why Did We Trust Him?");

        System.out.println(hashMap.containsKey("478-0-61159-424-8"));
        System.out.println(hashMap.get("978-1-60309-453-5"));
    }
}
