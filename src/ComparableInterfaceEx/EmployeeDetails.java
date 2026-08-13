//package ComparableInterfaceEx;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//class Employee implements Comparable<Employee> {
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
//    @Override
//    public String toString() {
//        return "Employee{" + "id=" + id + ", sal=" + sal + ", name='" + name + '\'' + '}';
//    }
//
//    @Override
//    public int compareTo(Employee enduring) {
//        return Integer.compare(this.sal, enduring.sal);
//    }
//}
//
//public class EmployeeDetails {
//    public static void main(String[] args) {
//        List<Employee> emp = new ArrayList<>();
//
//        emp.add(new Employee(2, 30000, "Krushna"));
//        emp.add(new Employee(1, 13000, "sneha"));
//        emp.add(new Employee(4, 10000, "reshma"));
//        emp.add(new Employee(3, 23000, "shusma"));
//
//        // Sorts using the compareTo method (by salary)
//        Collections.sort(emp);
//
//        System.out.println("--- Sorted by Salary (Natural Order) ---");
//        for (Employee e : emp) {
//            System.out.println(e);
//        }
//
//        Comparator<Employee> idComparator = (e1, e2) -> Integer.compare(e1.id, e2.id);
//        Collections.sort(emp, idComparator);
//
//        System.out.println("\n--- Re-sorted by ID (Using Comparator) ---");
//        for (Employee e : emp) {
//            System.out.println(e);
//        }
//    }
//}
