package CollectionExamples;

import java.util.ArrayList;
import java.util.List;

public class ListEX {
    static void main() {
        List list = new ArrayList();
        list.add(12);
        list.add("eee");

        System.out.println(list);
        System.out.println(list.get(0));

        String s = list.get(1).toString();
//        String s = (String)list.get(1);

        list.add(0, "heloo"); //it will shift the values after the index and add new object at that index
        System.out.println(list);

        System.out.println(list.contains("heloo"));

        System.out.println("Using forEach");
        list.forEach((Object o) -> System.out.println(o));

        System.out.println("Size of List : " + list.size());

        System.out.println("Return First object in List : " + list.getFirst());

        System.out.println(list.getClass());
        int hashValue  = list.hashCode();

        System.out.println("index of val : " + list.indexOf("heloo"));


        list.remove("heloo");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
