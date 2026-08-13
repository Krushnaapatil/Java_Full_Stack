package ComparableInterfaceEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenList {
    static void main() {
        List<Integer> number = Arrays.asList(2,3,4,5,6,7,8,9,11,23);

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> mult = new ArrayList<>();
        int sum = 0;
        for (Integer num : number){
            if (num%2 == 0)
                even.add(num);
            else
                odd.add(num);

            mult.add(num*2);
        }

        System.out.println("Even list :" + even);
        System.out.println("Odd list :" + odd);
        System.out.println("Multi by 2 list :" + mult);

        for (Integer num : number){
            sum += num;
        }
        System.out.println("Sum of Numbers : "+ sum);
    }
}
