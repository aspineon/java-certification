package _0005_casting_primitive_values;

public class MainApp {

	public static void main(String[] args) {

		int x = (int) 1.0;
		short y = (short) 1921222; // Stored as 20678
		int z1 = (int) 9l;
		int z2 = (int) 9L;
		long t = 123456789123456789L;

		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z1: " + z1);
		System.out.println("z2: " + z2);
		System.out.println("t: " + t);
		System.out.println(2147483647 + 1); // -2147483648

		short a = 10;
		short b = 3;
		// short c = a * b; // DOES NOT COMPILE
		short c1 = (short) (a * b);
		System.out.println("c1: " + c1);

		short c2 = 			1 + (short) (a * b); // DOES NOT COMPILE
		short c3 = (short) (1 + (short) (a * b));

		short c4 = 			(short) (a * b) + 1; // DOES NOT COMPILE
		short c5 = (short) ((short) (a * b) + 1);
		
		long goat = 10;
		int sheep = 5;
		sheep =   	    sheep * goat;  // DOES NOT COMPILE”
		sheep = (long) (sheep * goat); // DOES NOT COMPILE” 
		sheep = (int)  (sheep * goat);  

				
	}
}