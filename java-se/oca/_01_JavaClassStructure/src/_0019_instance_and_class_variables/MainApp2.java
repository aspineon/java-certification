package _0019_instance_and_class_variables;

public class MainApp2 {

	var tricky = "Hello"; // DOES NOT COMPILE

	public void whatTypeAmI() {
		var name = "Hello";
		var size = 7;
	}

	public void reassignment() {
		var number = 7;
		number = 4;
		number = "five"; // DOES NOT COMPILE
	}

	public void breakingDeclaration() {
		var silly = 1;
	}

	public void twoTypes() {
			int a, var b = 3;  // DOES NOT COMPILE
			var n = null;      // DOES NOT COMPILE
			var c = 2, d = 4;  // DOES NOT COMPILE
		}

	public void varAndNull() {
		var n = "myData";
		n = null;
		var m = 4;
		m = null; // DOES NOT COMPILE
		
		var o = (String)null;
	}

	
	public int addition(var a, var b) {  // DOES NOT COMPILE
		   return a + b;
	}

		
		
	public static void main(String[] args) {
		var name = "Katerina";
		var size = 35;

		var apples = (short) 10;
		apples = (byte) 5;
		apples = 1_000_000; // DOES NOT COMPILE

	}

}