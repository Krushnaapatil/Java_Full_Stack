package StaticNNonS;

class Project {
	static int balance = 1000;
	 String name = "It's Me";
}

public class StaticNNonStatic {

	public static void main(String[] args) {
		Project project = new Project();
		

		project.name = "krushna";
		project.balance = 30050;
		
		System.out.println(project.name);
		
		System.out.println(project.balance);
		
		Project project2 = new Project();
					
		
		System.out.println(project2.name);
		
		System.out.println(project2.balance);
		
		
		System.out.println( );
	}

}
