package _0016_foreach_statement;

public class MainApp1 {

	public static void printNames(String[] names) {
		for (int counter = 0; counter < names.length; counter++)
			System.out.println(names[counter]);
	}

	public static void main(String[] args) {
		
		String[] names = {"A", "B", "C"};
		printNames(names);
		System.out.println("----------------------------------");

	}
}