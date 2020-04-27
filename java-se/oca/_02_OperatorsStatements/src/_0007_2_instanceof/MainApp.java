package _0007_2_instanceof;

public class MainApp {

	Integer zooTime = Integer.valueOf(9);
	Number num = zooTime;
	Object obj = zooTime;

	public static void openZoo(Number time) {
		   if(time instanceof Integer)
		      System.out.println((Integer)time + " O'clock");
		   else
		      System.out.println(time);
	}
	
	public static void main(String[] args) {
		
		openZoo(7); // 7 O'clock
	
		System.out.println(null instanceof Object); // false
		
		Object noObjectHere = null;
		System.out.println(noObjectHere instanceof String); // false
		
		
		System.out.println(null == null);  // true

		System.out.println(null instanceof String);  // false
		
		System.out.println(null instanceof Integer);  // false

		System.out.print(null instanceof null);  // DOES NOT COMPILE
		
	}
}