package _0012_switch_statement;

public class MainApp2 {

	public static void main(String[] args) {

		int dayOfWeek = 5; 
		switch(dayOfWeek) {
			case 0: System.out.println("Sunday"); //break;   // Weekday
			default: System.out.println("Weekday"); //break; // Saturday
			case 6: System.out.println("Saturday"); break;
		}

	}
}