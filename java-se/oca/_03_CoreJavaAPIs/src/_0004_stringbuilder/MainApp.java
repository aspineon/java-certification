package _0004_stringbuilder;

public class MainApp {

	public static void main(String[] args) {

		System.out.println(" String");
		String alpha = "";
		for (char current = 'a'; current <= 'z'; current++)
			alpha += current + " ";

		System.out.println(alpha); // a b c d e f g h i j k l m n o p q r s t u v w x y z 
		System.out.println(alpha.toUpperCase()); // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
		System.out.println("-------------------------------------------");
		
		System.out.println("\n StringBuilder");
		StringBuilder alpha2 = new StringBuilder();
		for (char current = 'a'; current <= 'z'; current++)
			alpha2.append(current + " ");

		System.out.println(alpha2); // a b c d e f g h i j k l m n o p q r s t u v w x y z 
		// System.out.println(alpha2.toUpperCase()); // DO NOT COMPILE
		System.out.println(alpha2.toString().toUpperCase()); // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
		System.out.println("-------------------------------------------");
	
		System.out.println("\n StringBuilder: Mutability and Chaining 1");
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle"); // sb = "start+middle"
		System.out.println(sb); // start+middle
		System.out.println("-------------------------------------------");

		StringBuilder same = sb.append("+end"); // "start+middle+end"
		System.out.println(same); // start+middle+end
		System.out.println(sb); // start+middle+end
		System.out.println("-------------------------------------------");

		System.out.println("\n StringBuilder: Mutability and Chaining 2");
		StringBuilder a = new StringBuilder("abc"); 
		StringBuilder b = a.append("de");
		b = b.append("f").append("g"); 
		System.out.println("a=" + a); // a=abcdefg
		System.out.println("b=" + b); // b=abcdefg
		System.out.println("-------------------------------------------");
  
		StringBuilder sb1 = new StringBuilder(); 
		StringBuilder sb2 = new StringBuilder("animal"); 
		StringBuilder sb3 = new StringBuilder(10); 
		System.out.println("sb1=" + sb1); // empty
		System.out.println("sb2=" + sb2); // sb2=animal
		System.out.println("sb3=" + sb3); //		
 
	}
}