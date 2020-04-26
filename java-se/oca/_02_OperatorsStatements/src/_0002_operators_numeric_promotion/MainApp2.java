package _0002_operators_numeric_promotion;

public class MainApp2 {
	public static void main(String[] args) {

		int x = 1;
		long y = 33;
		var z = x * y;
		System.out.println(z);

		double x2 = 39.21;
		float y2 = (float) 2.1;
		var z2 = x2 + y2;
		System.out.println(z2);

		short x3 = 10;
		short y3 = 3;
		var z3 = x3 * y3;
		System.out.println(z3);

		short w4 = 14;
		float x4 = 13;
		double y4 = 30;
		var z4 = w4 * x4 / y4;
		System.out.println(z4);
	}
}