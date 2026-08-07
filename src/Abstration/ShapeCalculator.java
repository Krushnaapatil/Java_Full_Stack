package Abstration;


abstract class Shape {
	abstract void calculateArea();
	abstract void calculatePerimeter();
	void displayShape() {
		System.out.println("Shape Details");
	}
}

public class ShapeCalculator {

	public static void main(String[] args) {
		Shape rectangle = new Shape() {
			
			@Override
			void calculatePerimeter() {
				System.out.println("Perimeter of Rectangle: 30");
			}
			
			@Override
			void calculateArea() {
				System.out.println("Area of Rectangle: 50");
			}
		};
		
		rectangle.displayShape();
		rectangle.calculateArea();
		rectangle.calculatePerimeter();
	}

}
