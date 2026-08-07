package InterfacesEx;

interface Maximum {
	int findMax(int a, int b);
}


public class MaximumLambda {

	public static void main(String[] args) {
		Maximum max = (int a, int b) -> a<b ? b : a;
		
		System.out.println("Maximun : " + max.findMax(13, 15));
	
	}

}
