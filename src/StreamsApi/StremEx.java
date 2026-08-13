package StreamsApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StremEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 34, 23, 56, 778, 3454, 35, 66, 22);

        // --- Traditional approach ---
        List<Integer> even = new ArrayList<>();
        for (Integer n : list){
            if (n % 2 == 0) {
                even.add(n);
            }
        }
        System.out.println("For-loop output:   " + even);

        // --- Corrected Stream API approach ---
        Predicate<Integer> p = a -> a % 2 == 0; // Simplified predicate

        List<Integer> streamList = list.stream()   // 1. Target the correct stream source
                .filter(p)  // 2. Filter using the predicate
                .collect(Collectors.toList()); // 3. Java 8 way to gather results

        System.out.println("Stream API output: " + streamList);
    }
}
