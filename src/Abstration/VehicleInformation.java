package Abstration;

abstract class Vehicle {
	abstract void start();
	abstract void stop();
	void fuelType() {
		System.out.println("Fuel Type: Petrol");
	}
}

public class VehicleInformation {

	public static void main(String[] args) {
		Vehicle bikeVehicle = new Vehicle() {
			
			@Override
			void stop() {
				System.out.println("Bike Stopped");
			}
			
			@Override
			void start() {
				System.out.println("Bike Started");				
			}
		};
		
		bikeVehicle.fuelType();
		bikeVehicle.start();
		bikeVehicle.stop();
	}

}
