package CollectionExamples;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Dept: " + department + " | Salary: " + salary;
    }
}


public class EmployeeManagementSystem {
    private static ArrayList<Employee> empList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        empList.add(new Employee(101, "Krushna", 75000, "IT"));
        empList.add(new Employee(102, "Shaam", 50000, "HR"));
        empList.add(new Employee(103, "Ravi", 90000, "IT"));

        while (true) {
            System.out.println("\n=== EMPLOYEE MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Search Employee by Name");
            System.out.println("5. Update Salary");
            System.out.println("6. Update Department");
            System.out.println("7. Delete Employee");
            System.out.println("8. Find Highest-Paid Employee");
            System.out.println("9. Find Lowest-Paid Employee");
            System.out.println("10. Display Employees by Department");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> displayAll();
                case 3 -> searchById();
                case 4 -> searchByName();
                case 5 -> updateSalary();
                case 6 -> updateDepartment();
                case 7 -> deleteEmployee();
                case 8 -> findHighestPaid();
                case 9 -> findLowestPaid();
                case 10 -> displayByDepartment();
                case 11 -> {
                    System.out.println("Exiting System. Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // 1. Add Employee
    private static void addEmployee() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        // Prevent duplicate IDs
        if (findEmployeeById(id) != null) {
            System.out.println("Error: Employee with ID " + id + " already exists!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        empList.add(new Employee(id, name, salary, department));
        System.out.println("Employee added successfully!");
    }

    // 2. Display All
    private static void displayAll() {
        if (empList.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        for (Employee emp : empList) {
            System.out.println(emp);
        }
    }

    // 3. Search by ID
    private static void searchById() {
        System.out.print("Enter Employee ID to search: ");
        int id = scanner.nextInt();
        Employee emp = findEmployeeById(id);
        if (emp != null) {
            System.out.println("Found: " + emp);
        } else {
            System.out.println("Employee not found.");
        }
    }

    // 4. Search by Name
    private static void searchByName() {
        System.out.print("Enter Name to search: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Employee emp : empList) {
            if (emp.getName().equalsIgnoreCase(name) || emp.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) System.out.println("No employee matching that name was found.");
    }

    // 5. Update Salary
    private static void updateSalary() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        Employee emp = findEmployeeById(id);
        if (emp != null) {
            System.out.print("Enter New Salary: ");
            double newSalary = scanner.nextDouble();
            emp.setSalary(newSalary); // Modifies the object within the ArrayList
            System.out.println("Salary updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // 6. Update Department
    private static void updateDepartment() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        Employee emp = findEmployeeById(id);
        if (emp != null) {
            System.out.print("Enter New Department: ");
            String newDept = scanner.nextLine();
            emp.setDepartment(newDept);
            System.out.println("Department updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // 7. Delete Employee
    private static void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: ");
        int id = scanner.nextInt();
        Employee emp = findEmployeeById(id);
        if (emp != null) {
            empList.remove(emp); // Removes the object directly using .remove()
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // 8. Find Highest-Paid Employee
    private static void findHighestPaid() {
        if (empList.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }
        Employee highest = empList.get(0);
        for (int i = 1; i < empList.size(); i++) {
            if (empList.get(i).getSalary() > highest.getSalary()) {
                highest = empList.get(i);
            }
        }
        System.out.println("Highest Paid Employee: " + highest);
    }

    // 9. Find Lowest-Paid Employee
    private static void findLowestPaid() {
        if (empList.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }
        Employee lowest = empList.get(0);
        for (Employee emp : empList) {
            if (emp.getSalary() < lowest.getSalary()) {
                lowest = emp;
            }
        }
        System.out.println("Lowest Paid Employee: " + lowest);
    }

    // 10. Display Employees from a Particular Department
    private static void displayByDepartment() {
        System.out.print("Enter Department Name: ");
        String dept = scanner.nextLine();
        boolean found = false;
        for (Employee emp : empList) {
            if (emp.getDepartment().equalsIgnoreCase(dept)) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) System.out.println("No employees found in the " + dept + " department.");
    }

    // Helper : Avoids rewriting the lookup loop over and over
    private static Employee findEmployeeById(int id) {
        for (Employee emp : empList) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }
}

