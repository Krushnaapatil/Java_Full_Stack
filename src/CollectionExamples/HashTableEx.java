package CollectionExamples;

import java.util.Hashtable;

public class HashTableEx {
    static void main() {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "raj");
        table.put(2, "rj");
        table.put(3, "ar");
//        table.put(null, "null"); //throws NullPointerException
        System.out.println(table);
    }
}
