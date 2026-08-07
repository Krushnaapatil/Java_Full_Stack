package InterfacesEx;

interface HomeAppliance {
	void switchOn();
	void switchOff();
	default void warranty() {
		System.out.println("Warranty: 2 Years");
	}
}

public class HomeApplianceSystem {

	public static void main(String[] args) {
		HomeAppliance home = new HomeAppliance() {
			
			@Override
			public void switchOn() {
				System.out.println("Fan Switched On");
			}
			
			@Override
			public void switchOff() {
				System.out.println("Fan Switched Off");
			}
		};

		home.warranty();
		home.switchOn();
		home.switchOff();
	}

}
