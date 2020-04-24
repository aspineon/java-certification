package _0016_declaring_initializing_variables;

public class MainApp3 {

	public static void main(String[] args) {

		//Local variables must be initialized before use. 
		boolean b1 = false, b2 = true;
		System.out.println(b1); // false
		System.out.println(b2); // true

		//Local variables must be initialized before use. 
		String s1 = "Hello", s2 = null;
		System.out.println(s1); // Hello
		System.out.println(s2); // null

		//Local variables must be initialized before use. 
		int i1 = 100, i2 = 200;
		System.out.println(i1); // 100
		System.out.println(i2); // 200
	}
}