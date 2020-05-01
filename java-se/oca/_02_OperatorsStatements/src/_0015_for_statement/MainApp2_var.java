package _0015_for_statement;

public class MainApp2_var {

	public static void main(String[] args) {

		for (int counter = 5; counter > 0; counter--) {
			System.out.print(counter + " ");
		}

		System.out.println("\n----------------------------------");

		for (var counter = 5; counter > 0; counter--) {
			System.out.print(counter + " ");
		}

		System.out.println("\n----------------------------------");

		for (var counter = 4; counter >= 0; counter--) {
			System.out.print(counter + " ");
		}

	}
}