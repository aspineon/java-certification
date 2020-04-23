package _0013_order_initialization;

public class Chick {
	
	private String name = "MY_FIELD";
	{
		System.out.println("setting field: "+name); 
	}

	public Chick() {
		name = "MY_CONSTRUCTOR";
		System.out.println("setting constructor: "+name); //
	}

	public static void main(String[] args) {
		Chick chick = new Chick();
	 	System.out.println(chick.name);
	}
}