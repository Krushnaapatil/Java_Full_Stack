package InterfacesEx;

interface Greet {
	void greet();
}

public class GreetingApplicationLambda {

	public static void main(String[] args) {
		Greet greet = () -> System.out.println("Namastey");
		
		greet.greet();
	}

}
