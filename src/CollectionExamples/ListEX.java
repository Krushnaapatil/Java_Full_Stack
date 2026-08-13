package CollectionExamples;

import java.util.*;

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

        List<Integer> intList = Arrays.asList(12,34,22,66,45,78,56,88);
        System.out.println("Before Sorting : " + intList);
        Collections.sort(intList);
        System.out.println("After Sorting : " + intList);

//        Comparator<Integer> com = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1%10 > o2%10) {
//                    return 1;
//                }else {
//                    return -1;
//                }
//            }
//        };

        //Sorted based on second digit
        Comparator<Integer> com = (Integer o1, Integer o2) -> {
                if (o1%10 > o2%10)
                    return 1;
                else
                    return -1;
        };

        Collections.sort(intList, com);
        System.out.println("Sorted based on second digit : " + intList);


        //Sorted in decending order
//        Comparator<Integer> com2 = (Integer o1, Integer o2) -> {
//            if (o1 < o2 )
//                return 1;
//            else
//                return -1;
//        };
//        Comparator<Integer> com2 = (Integer a, Integer b) -> a<b ? 1 : -1;
//        Comparator<Integer> com2 = (a, b) -> Integer.compare(a,b);
//        Comparator<Integer> com2 = Integer::compare;
        Comparator<Integer> com2 = ( a,  b) -> a<b ? 1 : -1;
        Collections.sort(intList, com2);
        System.out.println("Sorted in Decending Order : " + intList);
    }
}
