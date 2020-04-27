package _0008_logical_operators;

public class MainApp {

	public static void main(String[] args) {
		
		int x = 10, y = 20, z = 10; 
		System.out.println(x < y);  // true 
		System.out.println(x <= y); // true 
		System.out.println(x >= z); // true 
		System.out.println(x > z);  // false
		System.out.println("------------------------------");
		
		int a = 6;
		boolean b = (a >= 6) || (++a <= 7); 
		System.out.println(b); // true 
		
		boolean c = (a >= 6000) && (++a <= 7); 
		System.out.println(c); // false 
		System.out.println("------------------------------");
		
		boolean eyesClosed = true;
		boolean breathingSlowly = true;
		
		boolean resting = eyesClosed | breathingSlowly;
		System.out.println(resting);  // true

		boolean asleep = eyesClosed & breathingSlowly;
		System.out.println(asleep);   // true
		
		boolean awake = eyesClosed ^ breathingSlowly;
		System.out.println(awake);    // false
	}
}