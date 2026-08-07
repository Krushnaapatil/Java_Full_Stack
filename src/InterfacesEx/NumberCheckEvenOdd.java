package InterfacesEx;

interface NumberCheck {
	void check(int number);
}

interface Square {
	int square(int number);
}

interface Result {
	void displayResult(int marks);
}

public class NumberCheckEvenOdd {

	public static void main(String[] args) {
//		NumberCheck num = (int number) -> {
//			if (number % 2 == 0) {
//				System.out.println(number + " is Even Number");
//			}else {
//				System.out.println(number + " is Odd Number");				
//			}
//		};
		//or 
		NumberCheck num = (int number) -> System.out.println(number%2==0 ? "Even" : "Odd");
		
		num.check(3);
		
		
		Square num1 = (number) -> number*number;
		System.out.println("Square : " + num1.square(4));
		
		
		Result result = (marks) -> {
			if (marks >= 35) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
		};
		
		result.displayResult(36);
	}

}
