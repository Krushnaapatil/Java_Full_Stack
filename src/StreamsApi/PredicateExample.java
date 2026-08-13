package StreamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Red", "Green", "Blue", "Gold", "Yellow");

        // Define a predicate to filter names starting with 'G'
        Predicate<String> startsWithG = name -> name.startsWith("G");

        List<String> filteredNames = names.stream()
                .filter(startsWithG) // Accepts Predicate
                .collect(Collectors.toList());

        System.out.println(filteredNames); // Output: [Green, Gold]
    }
}
