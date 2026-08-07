package java_fullstack;

public class StaticNNonStatic {
	final static int a =10;
	
	static {
		System.out.println("printing from Static Method");
	}
	
	{
		System.out.println("printing from Non-Static Method");
	}
	public StaticNNonStatic() { 
		System.out.println("Construtor");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		StaticNNonStatic static1 = new StaticNNonStatic();
		
		
	}

}
