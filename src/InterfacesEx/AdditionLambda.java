package InterfacesEx;

interface Addition {
	int add(int a, int b);
}
public class AdditionLambda {

	public static void main(String[] args) {
		Addition add = (int a, int b) -> a+b;
		
		System.out.println("Addition : " + add.add(12, 13));
	}

}
