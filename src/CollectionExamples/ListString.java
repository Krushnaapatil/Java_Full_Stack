package CollectionExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListString {
    static void main() {
        List<String> lst = Arrays.asList("krushan", "RJ", "ram", "ali", "mohabbat", "Krushna", "Abu");
        Comparator<String> com = (a, b) -> a.length()<b.length() ? 1 : -1;
        Collections.sort(lst,com);
        System.out.println("Sorting based on length: " + lst);
    }
}
