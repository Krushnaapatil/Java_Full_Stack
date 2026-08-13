package CollectionExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentDetails {
    static void main() {
        List<Integer> listS = Arrays.asList(12,34,65,23,44);
        Collections.sort(listS);
        System.out.println(listS);
    }
}
