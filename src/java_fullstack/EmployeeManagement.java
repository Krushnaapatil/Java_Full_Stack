package java_fullstack;

import java.util.Scanner;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("----------------------------");
        System.out.println("ID         : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.println("Salary     : " + salary);
    }
}

public class EmployeeManagement {

    static Employee[] employees = new Employee[100];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    // Create Employee
    static void createEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employees[count] = new Employee(id, name, department, salary);
        count++;

        System.out.println("Employee Added Successfully!");
    }

    // Delete Employee by ID
    static void deleteEmployee(int id) {
        int index = -1;

        for (int i = 0; i < count; i++) {
            if (employees[i].id == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee Not Found!");
            return;
        }

        for (int i = index; i < count - 1; i++) {
            employees[i] = employees[i + 1];
        }

        employees[count - 1] = null;
        count--;

        System.out.println("Employee Deleted Successfully!");
    }

    // Update Salary by ID
    static void updateSalary(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].id == id) {
                System.out.print("Enter New Salary: ");
                double salary = sc.nextDouble();
                employees[i].salary = salary;
                System.out.println("Salary Updated Successfully!");
                return;
            }
        }

        System.out.println("Employee Not Found!");
    }

    // Display Employees
    static void displayEmployees() {
        if (count == 0) {
            System.out.println("No Employees Found!");
            return;
        }

        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }
    
 // Display Employees
    static void displayEmployeesByID(int id) {
        for (int i = 0; i < count; i++) {
        	if(employees[i].id == id) {
                employees[i].display();
        	}
        }
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n||-----> Employee Management System <-----||");
            System.out.println("		1. Add Employee");
            System.out.println("		2. Delete Employee");
            System.out.println("		3. Update Salary");
            System.out.println("		4. Display Employees");
            System.out.println("		5. Display Employees Detail by ID");
            System.out.println("		6. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createEmployee();
                    break;

                case 2:
                    System.out.print("Enter Employee ID to Delete: ");
                    deleteEmployee(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Update Salary: ");
                    updateSalary(sc.nextInt());
                    break;

                case 4:
                    displayEmployees();
                    break;
                    
                case 5:
                    System.out.print("Enter Employee ID to display: ");                	
                	displayEmployeesByID(sc.nextInt());
                	break; 

                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
