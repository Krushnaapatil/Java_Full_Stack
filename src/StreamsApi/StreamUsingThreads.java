package StreamsApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamUsingThreads {
    static void main() {
        int size = 1000;
        List<Integer> list = new ArrayList<>(size);
        Random random = new Random();
        for (int i=0; i<size; i++){
            list.add(random.nextInt(100));
        }

        long seqStart = System.currentTimeMillis();
        list.stream().map(n->{
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
              }
            return n*n;
        }).mapToInt(n->n).reduce(0, (a,b)->a+b);
        long seqEnd = System.currentTimeMillis();

        long palStart = System.currentTimeMillis();
        list.parallelStream().map(n->{
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return n*n;
        }).mapToInt(n->n).reduce(0, (a,b)->a+b);
        long palEnd = System.currentTimeMillis();


        System.out.println("Thread time for seq stream using sleep method : " + (seqEnd-seqStart));
        System.out.println("Thread time for pal stream using sleep method : "+ (palEnd-palStart));
    }
}
