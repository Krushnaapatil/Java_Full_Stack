package java_fullstack;

class Stud {
	private final int id = 100;
	private double gpa;
	private String name;
	
	public Stud(double gpa, String name) {
		super();
		this.gpa = gpa;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}


public class Student {
	public static void main(String[] a) {
		Stud stud = new Stud(8.76, "krushna");
		System.out.println("GPA : " + stud.getGpa());
		System.out.println("ID : " + stud.getId());
		System.out.println("Name" + stud.getName());
	}
	
}
