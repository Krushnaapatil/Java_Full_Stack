package StreamsApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SeqStreamAndparallelStream {
    static void main() {
        int size = 100000000;
        List<Integer> pList = new ArrayList<>(size);
        Random random = new Random();
        for (int i=0; i<size; i++){
            pList.add(random.nextInt(100));
        }
//        System.out.println(pList);

        long seqStart = System.currentTimeMillis();
        int result = pList.stream().map(n->n*2).reduce(0, (a,b)->a+b);
        long seqEnd = System.currentTimeMillis();
        System.out.println("Result: " + result);
        System.out.println("Time to run seq Stream : "+ (seqEnd-seqStart));

        long palStart = System.currentTimeMillis();
        int result2 = pList.parallelStream().map(n->n*2).reduce(0, (a,b)->a+b);
        long palEnd = System.currentTimeMillis();
        System.out.println("Result: " + result2);
        System.out.println("Time to run parallelStream : "+ (palEnd-palStart));


        long seqStart2 = System.currentTimeMillis();
        int result3 = pList.stream().mapToInt(n->n*2).reduce(0, (a,b)->a+b);
        long seqEnd2 = System.currentTimeMillis();
        System.out.println("Result: " + result3);
        System.out.println("Time to run seq Stream using mapToInt : "+ (seqEnd2-seqStart2));

    }
}
