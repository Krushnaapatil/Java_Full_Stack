package StreamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ResuceExample {
    static void main() {
        List<Integer> Rlist = Arrays.asList(2,1,5,3,6,33,8,44);
        //print odd number
        System.out.println("Odd Number : ");
        Rlist.stream().filter(n->n%2!=0).forEach(System.out::println);
        System.out.println();

        //print num*num
        System.out.println("Num*Num : ");
        Rlist.stream().map(n->n*2).forEach(System.out::println);

        //reduce method use for printing SUM
        int sum = Rlist.stream().reduce(0,(a,b)->a+b);
        System.out.println("sum of all num : " + sum);


        BinaryOperator<Integer> bi = (a,b)->a+b;
        int result = Rlist.stream().reduce(0, bi);
        System.out.println("sum : " + result);

    }
}
