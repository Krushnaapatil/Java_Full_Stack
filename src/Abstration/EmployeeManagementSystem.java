package Abstration;

abstract class Employee {
    private String name; 
    private int baseSalary;
    private int id;
    private int departmentId;
    protected int totalSalary; 

    public Employee(int id, String name, int baseSalary, int departmentId) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.departmentId = departmentId;
        this.totalSalary = baseSalary;
        
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getBaseSalary() { return baseSalary; }
    public void setBaseSalary(int baseSalary) { this.baseSalary = baseSalary; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getDepartmentId() { return departmentId; }
    public void setDepartmentId(int departmentId) { this.departmentId = departmentId; }

    public int getTotalSalary() { return totalSalary; }

    public abstract int calculateSalary();

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Dept ID=" + departmentId 
                + ", Base Salary=$" + baseSalary + ", Total Salary=$" + totalSalary + "]";
    }
}

class Developer extends Employee {
    public Developer(int id, String name, int baseSalary, int departmentId) {
        super(id, name, baseSalary, departmentId);
    }

    @Override
    public int calculateSalary() {
        totalSalary = getBaseSalary() + 1500;
        return totalSalary;
    }
}


class Tester extends Employee {
    public Tester(int id, String name, int baseSalary, int departmentId) {
        super(id, name, baseSalary, departmentId);
    }

    @Override
    public int calculateSalary() {
        totalSalary = getBaseSalary() + 800;
        return totalSalary;
    }
}

class Manager extends Employee {
    public Manager(int id, String name, int baseSalary, int departmentId) {
        super(id, name, baseSalary, departmentId);
    }

    @Override
    public int calculateSalary() {
        totalSalary = getBaseSalary() + (int)(getBaseSalary() * 0.20);
        return totalSalary;
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        
        employees[0] = new Developer(101, "krushna", 7000, 10);
        employees[1] = new Tester(102, "kartik", 5000, 10);
        employees[2] = new Manager(103, "om", 9000, 20);
        employees[3] = new Developer(104, "jay", 7500, 12);

        System.out.println("--- Calculating Salaries ---");
        for (Employee emp : employees) {
            emp.calculateSalary();
            System.out.println(emp); 
        }

        System.out.println("\n--- Search Results ---");
        
        String exactSearchTerm = "krushna";
        String partialSearchTerm = "k";

        System.out.println("Searching for exact match (ignore case): '" + exactSearchTerm + "'");
        for (Employee emp : employees) {
            if (emp.getName().equalsIgnoreCase(exactSearchTerm)) {
                System.out.println("Found Match: " + emp);
            }
        }

        System.out.println("\nSearching for partial match (case-sensitive contains): '" + partialSearchTerm + "'");
        for (Employee emp : employees) {
            if (emp.getName().contains(partialSearchTerm)) {
                System.out.println("Found Match: " + emp);
            }
        }
    }
}
