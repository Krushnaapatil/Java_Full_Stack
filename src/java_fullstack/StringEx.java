package java_fullstack;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameString = new String("f");
		System.out.println(nameString.intern());
		String nameString2 = new String("f");
		System.out.println(nameString == nameString2);
		
		String aString = "a";
		String bString = "a";
		System.out.println(aString == bString);
		
		nameString += "a";
		System.out.println(nameString);
		System.out.println(nameString.intern());
		
		String text = "apple,banana,orange";
		String[] fruits = text.split(","); 

		// Result: ["apple", "banana", "orange"]
		System.out.println(fruits[0]);	
		
		
		String text2 = "192.168.1.1";

		String[] wrong = text2.split(".");   
		String[] right = text2.split("\\."); 
		
		System.out.println(Arrays.toString(wrong));
		System.out.println(Arrays.toString(right));
		
		System.out.println(text.indexOf('p'));

	}

}
