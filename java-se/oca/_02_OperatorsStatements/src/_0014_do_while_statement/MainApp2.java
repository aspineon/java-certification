package _0014_do_while_statement;

public class MainApp2 {

	public static void main(String[] args) {

		int myVal = 2;

		while (myVal > 1) {
			System.out.println("myVal: " + myVal); // 2
			myVal--;
		}

		System.out.println("myVal: " + myVal); // 1
		System.out.println("---------------------");

		myVal = 2;

		if (myVal > 1) {
			do {
				System.out.println("myVal: " + myVal); // 2
				myVal--;
			} while (myVal > 10);
		} else {
			myVal++;
		}

		System.out.println("myVal: " + myVal); // 1

	}
}