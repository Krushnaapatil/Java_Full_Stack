package CollectionExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class HashMapEx {
    static void main() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "krushna");
        map.put(2, "raj");
        map.put(3, "Ram");
        map.put(4, "lucky");

        System.out.println("Directly rpint val : ");
        for (String v : map.values()){
            System.out.println(v);
        }

        System.out.println("Printing using keySet");
        for (Integer k : map.keySet()){
            System.out.println(map.get(k));
        }

        map.forEach((key, val) -> {
            System.out.println(val);
        });

        BiConsumer<Integer, String> biConsumer = (Integer integer, String s) -> System.out.println("hello");
        System.out.println("Prints Hello for no. of times as size of Map");
        map.forEach(biConsumer);
    }
}
