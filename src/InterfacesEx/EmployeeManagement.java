package InterfacesEx;

interface Employee {
	void work();
	void takeBreak();
	default void officeTiming() {
		System.out.println("Office Timing: 9 AM to 6 PM");
	}
}

public class EmployeeManagement {

	public static void main(String[] args) {
		Employee employee = new Employee() {
			
			@Override
			public void work() {
				System.out.println("Employee is Working");
			}
			
			@Override
			public void takeBreak() {
				System.out.println("Employee takes Break");
			}
		};
		
		employee.officeTiming();
		employee.work();
		employee.takeBreak();
	}

}
