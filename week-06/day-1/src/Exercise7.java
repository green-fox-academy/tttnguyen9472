import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
//    Write a Stream Expression to find the strings which
//    starts with a given letter(as parameter), in the following list:

    public static List<String> search(List<String> inputList, String searchTerm){
        return inputList.stream()
                .filter(element -> element.contains(searchTerm))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA",
                "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        for (String result : search(cities, "RO")) {
            System.out.println(result);
        }
    }
}
