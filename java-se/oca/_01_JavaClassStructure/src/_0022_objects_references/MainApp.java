package _0022_objects_references;

public class MainApp {
	public static void main(String[] args) {

		String one, two;
		one = new String("a");
		two = new String("b");

		System.out.println("one: " + one); // a
		System.out.println("two: " + two); // b
		System.out.println("-------------");

		one = two; 
		System.out.println("one: " + one);  // b
		System.out.println("-------------");

		String three = one;
		System.out.println("three: " + three); // b
		System.out.println("-------------");

		one = null;
		System.out.println("one: " + one); // null
		System.out.println("two: " + two); // b
		System.out.println("three: " + three); // b

	}
}