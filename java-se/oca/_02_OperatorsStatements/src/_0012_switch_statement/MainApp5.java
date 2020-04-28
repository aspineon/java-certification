package _0012_switch_statement;

// Acceptable Case Values
public class MainApp5 {

	final int getCookies() {
		return 4;
	}

	void feedAnimals() {
		
		final int bananas = 1;
		int apples = 2;
		int numberOfAnimals = 3;
		final int cookies = getCookies();

			switch (numberOfAnimals) {
				case bananas:
				case apples: // DOES NOT COMPILES
				//case getCookies(): // DOES NOT COMPILE
				//case cookies: // DOES NOT COMPILE
				case 3 * 5:
			}
	}

	public static void main(String[] args) {

	}
}