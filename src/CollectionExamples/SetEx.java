package CollectionExamples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
    static void main() {
//        Set s = new TreeSet(); //print in order as it is treeSet
        Set s = new HashSet(); //print unsorted order as it is hashset
        s.add(12);
        s.add(162);
        s.add(12);
        s.add(null);
        s.add(null);
        s.add(212);
        s.add(124);
        System.out.println(s);

    }
}
