class manager {
    public manager(String name, int empId, int salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}

	String name;
    int empId;
    int salary;
    
    public void showSalary() {
    	System.out.println("Salary :" + this.salary);
    }
}

class Employee extends manager {
	public Employee(String name, int empId, int salary) {
		super(name, empId, salary);
	}

	
	
}

public class ReferenceTSA {
    public static void main(String[] args) {
        
//    	manager m = new manager("manager_krushna", 101, 100000);
    	
    	Employee employee = new Employee("Employee_raj", 102, 50000);
    	
    	employee.showSalary();
    }
}
