package _0018_optional_labels;

public class MainApp3_continue {

	public static void main(String[] args) {

		CLEANING: for (char stables = 'a'; stables <= 'd'; stables++) {
			for (int leopard = 1; leopard < 4; leopard++) {

				if (stables == 'b' || leopard == 2) {
					continue CLEANING;
				}

				System.out.println("Cleaning: " + stables + "," + leopard);
			}
		}

	}
}