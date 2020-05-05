package _0004_stringbuilder;

public class MainApp3 {

	public static void main(String[] args) {

		System.out.println("charAt(), indexOf(), length(), substring()");
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("mal")); 
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(sub + " " + len + " " + ch); // ani 7 s
		System.out.println("-------------------------------------------");
			
		System.out.println("\n append(String str), toString");
		StringBuilder sb2 = new StringBuilder().append(1).append('c'); 
		sb2.append("-").append(true);
		System.out.println(sb2); // 1c-true
		System.out.println("-------------------------------------------");
	
		System.out.println("\n insert(int offset, String str)");		
		StringBuilder sb3 = new StringBuilder("animals");
		sb3.insert(7, 1); 		 // animals1
		sb3.insert(4, "-"); 	 // anim-als1
		sb3.insert(0, true);	 // trueanim-als1
		sb3.insert(4, "="); 	 // true=anim-als1
		System.out.println(sb3); // true=anim-als1
		System.out.println("-------------------------------------------");

		System.out.println("\n delete(int startIndex, int endIndex)");
											 //012345 
		StringBuilder sb4 = new StringBuilder("abcdef");
		sb4.delete(1, 3); 
		System.out.println(sb4); // adef 
		System.out.println("-------------------------------------------");
	
		System.out.println("\n deleteCharAt(int index)");    
		sb4.deleteCharAt(0); // a
		System.out.println(sb4); // def
	 // sb4.deleteCharAt(5); // throws an exception
		System.out.println("-------------------------------------------");
		
		System.out.println("\n replace(int startIndex, int endIndex, String newString)");    
		StringBuilder builder = new StringBuilder("Katerina LENA");
		builder.replace(3, 6, "ANYA");
		System.out.println(builder);  // KatANYAna LENA
		System.out.println("-------------------------------------------");	
			
		StringBuilder builder2 = new StringBuilder("Katerina LENA");
		builder2.replace(3, 10, "");
		System.out.println(builder2); // KatENA
		System.out.println("-------------------------------------------");	

		System.out.println("\n reverse()");    
		StringBuilder sb5 = new StringBuilder("ABC"); 
		sb5.reverse();
		System.out.println(sb5); // CBA	
		System.out.println("-------------------------------------------");
	
		System.out.println("\n toString()");    
		String s = sb.toString();
		System.out.println(s);	// animals-true
	}
}