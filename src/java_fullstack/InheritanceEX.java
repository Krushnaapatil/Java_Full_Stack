
package java_fullstack;

class Vehicle {
 void startEngine() {
     System.out.println("Vehicle engine starts with a generic sound.");
 }
}

class SportsCar extends Vehicle {
 @Override
 void startEngine() { 
     System.out.println("SportsCar engine ROARS to life!");
 }
}

class Truck extends Vehicle {
 @Override
 void startEngine() { 
     System.out.println("Truck engine rumbles heavily.");
 }
}

class Motorcycle extends Vehicle {
 @Override
 void startEngine() {
     System.out.println("Motorcycle engine revs high!");
 }
}

public class InheritanceEX {
 public static void main(String[] args) {
     
     Vehicle myVehicle1; 

     myVehicle1 = new SportsCar();
     myVehicle1.startEngine(); 

     Vehicle myVehicle2 = new Truck();
     myVehicle2.startEngine(); 

     Vehicle myVehicle3 = new Motorcycle();
     myVehicle3.startEngine(); 
     
     Vehicle[] vehicle = {new SportsCar(), new Truck(), new Motorcycle()};
     
     for(Vehicle v : vehicle) {
    	 v.startEngine();
     }
 }
}
