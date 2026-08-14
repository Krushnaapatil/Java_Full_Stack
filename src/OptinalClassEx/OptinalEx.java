package OptinalClassEx;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptinalEx {
    static void main() {
        List<String> names = Arrays.asList("Krushna", "Ramu kaka", "Sonu Chunni", "Raju kaka", "Babu bhaiya");
        List<String> name = names.stream().filter(n->n.contains("kaka")).toList();
        System.out.println("using toList() : " + name);

        Optional<String> name2 = names.stream().filter(n->n.contains("kaka")).findFirst();
        System.out.println("using Optinal class : " + name2);

        Optional<String> name3 = names.stream().filter(n->n.contains("Mama")).findFirst();
        System.out.println("using Optinal class orElse : " + name3.orElse("Name not in List of Names.."));

        Optional<String> name4 = names.stream().
                                    filter(n->n.contains("Mama")).
                                    findFirst().orElse("Name not found").
                                    describeConstable();
        System.out.println("using Optinal class orElse : " + name4);


        // Change the variable type to String
        String name5 = names.stream()
                .filter(n -> n.contains("Mama"))
                .findFirst()
                .orElse("Name not found");

        System.out.println(name5);
        // Output: Mama (if found) OR "Name not found" (if empty)

    }
}
