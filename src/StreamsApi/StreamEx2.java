package StreamsApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(12, 33, 23, 56, 78, 55, 37, 66, 22);

        // --- Traditional approach for Even Number ---
        List<Integer> even = new ArrayList<>();
        for (Integer n : list2) {
            if (n % 2 == 0) {
                even.add(n);
            }
        }
        System.out.println("For-loop output:   " + even);

        // --- Stream approach for Even Number ---
        Stream<Integer> streamList = list2.stream();

        List<Integer> streamEven = streamList.filter(n -> n % 2 == 0).toList();

        System.out.println("Stream output:     " + streamEven);

        System.out.println("Even Number in single line");
        list2.stream().filter(n->n%2==0).forEach(n-> System.out.print(n+" "));

        System.out.println();

        //using Predicate and Consumer to give our own implementation
        System.out.println("using Predicate and Consumer to give our own implementation");
        Predicate<Integer> p = a->a%2==0;
        Consumer<Integer> con = a-> System.out.print(a+" ");
        list2.stream().filter(p).forEach(con);

        System.out.println();

        List<Integer> mul = new ArrayList<>();
        for (Integer n : list2){
            mul.add(n*2);
        }
        System.out.println("multi by 2 using normal method :"+mul);

        Function<Integer, Integer> fun = a->a*2;
        System.out.println("multi by 2 using stream api : ");
        list2.stream().map(fun).forEach(n-> System.out.print(n+ " "));

//        Function<Integer, Integer> fun = a->a*2;
//        System.out.println("multi by 2 using stream api : ");
//        list2.stream().map(fun).forEach(n-> System.out.print(n+ " "));

        System.out.println("multi by 2 using stream api : ");
        list2.stream().map(n->n*2).forEach(n-> System.out.print(n+ " "));

        System.out.println();

        System.out.println("multi by 3 using stream api : ");
        list2.stream().map(n->n*3).forEach(n-> System.out.print(n+ " "));

    }
}
