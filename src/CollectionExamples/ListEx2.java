//package CollectionExamples;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//class Employee implements Comparable<Employee> { // 1. Implemented Comparable for sorting
//    int id;
//    int sal;
//    String name;
//
//    public Employee(int id, int sal, String name) {
//        this.id = id;
//        this.sal = sal;
//        this.name = name;
//    }
//
//    // 2. Overriding toString() to make the printed output readable
//    @Override
//    public String toString() {
//        return "Employee{id=" + id + ", sal=" + sal + ", name='" + name + "'}";
//    }
//
//    // 3. Defining how to compare two Employee objects (by ID in this case)
//    @Override
//    public int compareTo(Employee other) {
//        return Integer.compare(this.id, other.id);
//    }
//}
//
//public class ListEx2 {
//    // 4. Fixed the main method signature so Java can run it
//    public static void main(String[] args) {
//
//        // Mixed list (Raw type List)
//        List list = Arrays.asList(12, 13, 14, 15, "hello", "by");
//        System.out.println("Mixed List: " + list);
//
//        // Sorting Integers
//        List<Integer> list2 = Arrays.asList(12, 23, 5, 13, 78, 14, 15);
//        System.out.println("Unsorted Integers: " + list2);
//        Collections.sort(list2);
//        System.out.println("Sorted Integers: " + list2);
//
//        // Sorting Strings
//        List<String> Slist = Arrays.asList("a", "er", "cb", "cr", "baby", "jaanu");
//        System.out.println("\n--- String List Loop ---");
//        for (String a : Slist) {
//            System.out.println(a);
//        }
//        Collections.sort(Slist);
//        System.out.println("Sorted Strings: " + Slist);
//
//        // Sorting Custom Employee Objects
//        List<Employee> emp = Arrays.asList(
//                new Employee(12, 3000, "kushna"),
//                new Employee(11, 40000, "raj")
//        );
//
//        System.out.println("\nUnsorted Employees: " + emp);
//
//        // This works now because Employee implements Comparable!
//        Collections.sort(emp);
//
//        System.out.println("Sorted Employees (by ID): " + emp);
//    }
//}
