package _0012_switch_statement;

public class MainApp6 {

	public static void main(String[] args) {
		
		short size = 4;
		final int small = 15;
		final int big = 1_000_000;
		
		switch(size) {
		   case small: System.out.print("small"+small);
		   case 1+3 : System.out.print("1+3: "+(1+3));
		 //  case big:  // DOES NOT COMPILE
		}
	}

}