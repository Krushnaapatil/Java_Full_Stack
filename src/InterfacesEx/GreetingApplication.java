package InterfacesEx;

interface Greeting {
	void greet();
	
	default void welcomeMessage() {
		System.out.println("**Welcome User**");
	}
}

public class GreetingApplication {

	public static void main(String[] args) {
		Greeting greeting = () -> {
			System.out.println("Hello! Welcome to Java Programming.");
		};
		greeting.welcomeMessage();
		greeting.greet();
	}

}
