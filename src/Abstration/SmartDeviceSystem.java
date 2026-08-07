package Abstration;

abstract class SmartDevice {
	abstract void powerOn();
	abstract void powerOff();
	void brand() {
		System.out.println("Brand: Samsung");
	}
}

public class SmartDeviceSystem {

	public static void main(String[] args) {
			
		SmartDevice tvDevice = new SmartDevice() {
			@Override
			void powerOn() {
				System.out.println("Smart TV Powered On");
			}
			
			@Override
			void powerOff() {
				System.out.println("Smart TV Powered Off");
				
			}
		};
		
		tvDevice.brand();
		tvDevice.powerOn();
		tvDevice.powerOff();
	}

}
