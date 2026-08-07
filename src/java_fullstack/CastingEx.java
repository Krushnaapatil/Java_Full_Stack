package java_fullstack;

class Pay{
	void pay() {
		System.out.println("paid");
	}
}

class CreaditC extends Pay{

	public CreaditC() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}


public class CastingEx {
	private static void main(String[] args) {
		CreaditC c = (CreaditC) new Pay();
		c.pay();
		
		Pay pay = new CreaditC();
		CreaditC c2 = (CreaditC) new Pay();
		
	}
}

