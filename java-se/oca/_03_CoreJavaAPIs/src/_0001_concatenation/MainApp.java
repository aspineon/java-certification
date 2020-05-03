package _0001_concatenation;

public class MainApp {

	public static void main(String[] args) {
		
		String name1 = "Lena";
		System.out.println("name1: "+ name1); // Lena

		String name2 = new String("Katerina");	
		System.out.println("name2: "+ name2); // Katerina
		
		System.out.println("-------------------------------------------");

		System.out.println(1 + 3);		   		 // 4
		System.out.println("a" + "b"); 	   		 // ab
		System.out.println("a" + "b" + 1 + 3);   // ab13
		System.out.println("a" + "b" + (1 + 3)); // ab4
		System.out.println(1 + 3 + "a" + "b");   // 4ab
		System.out.println( "a" + 1 + 3 + "b");  // a13b
		System.out.println( "a" + (1 + 3) + "b");// a4b
		
		System.out.println("-------------------------------------------");
		
		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four); //64
		
		System.out.println("-------------------------------------------");

		String s = "1"; 		// s currently holds "1"
		s += "2"; 				// s currently holds "12"
		s += 3; 				// s currently holds "123"
		System.out.println(s);  // 123
		   
		System.out.println("-------------------------------------------");
	
		String s1 = "10";
		String s2 = s1.concat("20"); 
		System.out.println(s2); //1020
		System.out.println(s2.concat("30")); // 102030
		System.out.println(s2); //1020
	}
}