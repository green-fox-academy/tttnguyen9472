import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ProductDatabase {
// We are going to represent our products in a map where the keys are strings representing the product's name and the values are numbers representing the product's price.
//
// Create a map with the following key-value pairs.
//    Product name (key) 	Price (value)
//    Eggs 	200
//    Milk 	200
//    Fish 	400
//    Apples 	150
//    Bread 	50
//    Chicken 	550
//
// Create an application which solves the following problems.
//    How much is the fish?
//    What is the most expensive product?
//    What is the average price?
//    How many products' price is below 300?
//    Is there anything we can buy for exactly 125?
//    What is the cheapest product?

// Create an application which solves the following problems.
//    Which products cost less than 201? (just the name)
//    Which products cost more than 150? (name + price)

    public static void main(String[] args) {
        HashMap<String, Integer> productMap = new HashMap<>();
        createMap(productMap);

        System.out.println("How much is the fish?");
        System.out.println(productMap.get("Fish"));
        System.out.println("What is the most expensive product?");
        System.out.println(mostExpensive(productMap));
        System.out.println("What is the average price?");
        System.out.println(averagePrice(productMap));
        System.out.println("How many products' price is below 300?");
        System.out.println(below300(productMap));
        System.out.println("Is there anything we can buy for exactly 125?");
        if (productMap.containsValue(125)) {
            System.out.println("Yes, we can buy something for exactly 125.");
        } else {
            System.out.println("No, there is nothing for exactly 125.");
        }
        System.out.println("What is the cheapest product?");
        System.out.println(cheapest(productMap));
        System.out.println("Which products cost less than 201?");
        System.out.println(lessThan201(productMap));
        System.out.println("Which products cost more than 150?");
        System.out.println(moreThan150(productMap));
    }

    public static HashMap<String, Integer> createMap(HashMap<String, Integer> productMap) {
        productMap.put("Eggs", 200);
        productMap.put("Milk", 200);
        productMap.put("Fish", 400);
        productMap.put("Apples", 150);
        productMap.put("Bread", 50);
        productMap.put("Chicken", 550);
        return productMap;
    }

    public static String mostExpensive(HashMap<String, Integer> productMap) {
        int max = 0;
        String item = "";
        for (String key : productMap.keySet()) {
            if (productMap.get(key) > max) {
                max = productMap.get(key);
                item = key;
            }
        }
        return item;

    }

    public static double averagePrice(HashMap<String, Integer> productMap) {
        double average = 0;
        for (String key : productMap.keySet()) {
            average += productMap.get(key);
        }
        average = average / productMap.size();
        return average;
    }

    public static int below300(HashMap<String, Integer> productMap) {
        int counter = 0;
        for (String key : productMap.keySet()) {
            if (productMap.get(key) < 300) {
                counter++;
            }
        }
        return counter;
    }

    public static String cheapest(HashMap<String, Integer> productMap) {
        int min = Integer.MAX_VALUE;
        String item = "";
        for (String key : productMap.keySet()) {
            if (productMap.get(key) < min) {
                min = productMap.get(key);
                item = key;
            }
        }
        return item;

    }

    public static List<String> lessThan201(HashMap<String, Integer> productMap) {
        List<String> productsLessThan201 = new ArrayList<>();
        String product = "";
        for (String key : productMap.keySet()){
            if(productMap.get(key) < 201){
                productsLessThan201.add(key);

            }
        }
        return productsLessThan201;
    }

    public static HashMap<String, Integer> moreThan150(HashMap<String, Integer> productMap) {
        HashMap<String, Integer> productsMoreThan150 = new HashMap<>();
        String product = "";
        for (String key : productMap.keySet()){
            if(productMap.get(key) > 150){
                productsMoreThan150.put(key, productMap.get(key));

            }
        }
        return productsMoreThan150;
    }
}
