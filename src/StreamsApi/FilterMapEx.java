package StreamsApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterMapEx {
    static void main() {
        List<Integer> list = Arrays.asList(20, 60, 40, 80, 30, 90);
        System.out.println("numbers greater than 50 :");
        list.stream().filter(n->n>50).forEach(System.out::println);

        List<Integer> list2 = Arrays.asList(10, 40, 20, 50, 15, 60);
        System.out.println("numbers less than 30 :");
        list2.stream().filter(n->n<30).forEach(System.out::println);

        List<Integer> list3 = Arrays.asList(2,3,4,5);
        System.out.println("square of every number :");
        list3.stream().map(n->n*n).forEach(System.out::println);

        List<Integer> list4 = Arrays.asList(2,3,4,5);
        System.out.println("cube of every number :");
        list4.stream().map(n->n*n*n).forEach(System.out::println);

        List<Integer> list5 = Arrays.asList(10, 12, 15, 22, 25, 30);
        System.out.println("numbers divisible by 5 :");
        list5.stream().filter(n->n%5==0).forEach(System.out::println);

        List<Integer> list6 = Arrays.asList(-10, 20, -5, 30, -2, 40);
        System.out.println("display only positive numbers :");
        list6.stream().filter(n->n>0).forEach(System.out::println);

        System.out.println("display only negative numbers :");
        list6.stream().filter(n->n<0).forEach(System.out::println);
    }
}
