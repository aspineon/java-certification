package _0013_order_initialization;

public class Egg {
	
	// STEP 2
	public Egg() {
		System.out.println("head - in constructor: " + number); // 2
		number = 3;
		System.out.println("foot - in constructor: " + number); // 3
	}

	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println("in main: " + egg.number); // 3
	}

	// STEP 1
	private int number = 1;
	{
		System.out.println("head - in block: " + number); // 1
		number = 2;
		System.out.println("foot - in block: " + number); // 2
	}
}