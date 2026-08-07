package InterfacesEx;


interface Emp {
	void sal();
}

class Dev implements Emp {
	public void sal() {
		System.out.println("Salry is 300000 for dev");
	}
}

public class SimpleEx1 {

	public static void main(String[] args) {
		Emp devEmp = new Dev();
		devEmp.sal();
	}

}
