package java_fullstack;

//Abstract Parent Class
abstract class Car {
 // Instance variables
 String brand;
 String fuelType;

 // 1. Constructor: Used to initialize common properties when a subclass is created
 public Car(String brand, String fuelType) {
     this.brand = brand;
     this.fuelType = fuelType;
     System.out.println(brand + " car initialization started...");
 }

 // 2. Abstract Method: Forces every subclass to define its own acceleration logic
 public abstract void accelerate();

 // 3. Concrete Method: Shared behavior that works the same for all cars
 public void displayDetails() {
     System.out.println("Brand: " + brand + " | Fuel: " + fuelType);
 }
}

//Concrete Subclass
class ElectricCar extends Car {
 int batteryCapacity;

 // Subclass Constructor
 public ElectricCar(String brand, int batteryCapacity) {
     // Calls the constructor of the abstract parent class
     super(brand, "Electric"); 
     this.batteryCapacity = batteryCapacity;
 }

 // Implementing the Abstract Method
 @Override
 public void accelerate() {
     System.out.println(brand + " surges forward instantly using electric motors! Silent power.");
 }
}


public class Abstraction {
	//Main Class to run the code
	public class Main {
	 public static void main(String[] args) {
	     // Creating an object of the concrete subclass
	     Car myTesla = new ElectricCar("Tesla", 100);

	     // Calling the concrete method inherited from Car
	     myTesla.displayDetails();

	     // Calling the implemented abstract method
	     myTesla.accelerate();
	 }
}
}
