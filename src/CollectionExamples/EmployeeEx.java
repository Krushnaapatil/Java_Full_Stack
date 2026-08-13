package CollectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeClass {
    int id;
    String name;
    int sal;

    public EmployeeClass(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getSal() { return sal; }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}

public class EmployeeEx {
    public static void main(String[] args) {
        // Defined the list using Generics <EmployeeClass> instead of raw types
        List<EmployeeClass> emp = new ArrayList<>();
        emp.add(new EmployeeClass(2, "Krushna", 600000));
        emp.add(new EmployeeClass(1, "seta", 3455000));
        emp.add(new EmployeeClass(4, "kaali", 8777000));
        emp.add(new EmployeeClass(3, "remo", 999990));
        emp.add(new EmployeeClass(5, "Anyy", 199090));

        System.out.println("Without sorting :");
        for (EmployeeClass e : emp){
            System.out.println(e);
        }

        // 1. Sorting by ID using double colon (::)
        System.out.println("\nSorted by ID :");
        Comparator<EmployeeClass> comById = Comparator.comparingInt(EmployeeClass::getId);
        Collections.sort(emp, comById);

        for (EmployeeClass e : emp){
            System.out.println(e);
        }

        // 2. Sorting by Name using double colon (::)
        System.out.println("\nSorted by Name :");
        Comparator<EmployeeClass> comByName = Comparator.comparing(EmployeeClass::getName);
        Collections.sort(emp, comByName);

        for (EmployeeClass e : emp){
            System.out.println(e);
        }

        // 3. Sorting by Salary using double colon (::)
        System.out.println("\nSorted by Salary :");
        Comparator<EmployeeClass> comBySal = Comparator.comparingInt(EmployeeClass::getSal);
        Collections.sort(emp, comById);

        for (EmployeeClass e : emp){
            System.out.println(e);
        }

//        // 3. Sorting by Name in Ascending order
//        System.out.println("\nSorted by Name :");
//        Comparator<EmployeeClass> comByNameAsc = Comparator.comparing(empl -> empl.getName().length());
//        Collections.sort(emp, comByName);
//
//        for (EmployeeClass e : emp){
//            System.out.println(e);
//        }
    }
}
