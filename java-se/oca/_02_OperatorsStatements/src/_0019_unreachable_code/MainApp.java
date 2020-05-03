package _0019_unreachable_code;

public class MainApp {

	public static void main(String[] args) {
		
		int checkDate = 0;
		
		while (checkDate < 10) {
			checkDate++;
			if (checkDate > 100) {
				break; 
				checkDate++; // DOES NOT COMPILE
			}
		}
		
		System.out.println("-------------------------------------------");
		
		
		int minute = 1;
		WATCH: while(minute>2) {
		   if(minute++>2) {
		      continue WATCH;
		      System.out.print(minute);  // DOES NOT COMPILE
		   }
		}
		
		System.out.println("-------------------------------------------");

		
		int hour = 2;
		switch(hour) {
		   case 1: return; 
		   	hour++;  // DOES NOT COMPILE
		   case 2: 
		}
		
	}

}
