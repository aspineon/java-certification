package _0019_instance_and_class_variables;

public class MainApp1 {

	//Instance and class variables do not require you to initialize them.
	static boolean myVal1; // false
	static byte myVal2;    // 0
	static short myVal3;   // 0
	static int myVal4;     // 0
	static long myVal5;    // 0
	static float myVal6;   // 0.0
	static double myVal7;  // 0.0
	static char myVal8;    // 

	// All object references (everything else) null
	static Boolean myVal9;
	static Byte myVal10;
	static Short myVal11;
	static Integer myVal12;
	static Long myVal13;
	static Float myVal14;
	static Double myVal15;
	static Character myVal16;

	public static void main(String[] args) {
		System.out.println("boolean " + myVal1);
		System.out.println("byte " + myVal2);
		System.out.println("short " + myVal3);
		System.out.println("int " + myVal4);
		System.out.println("long " + myVal5);
		System.out.println("float " + myVal6);
		System.out.println("double " + myVal7);
		System.out.println("char " + myVal8);

		System.out.println("Boolean " + myVal9);
		System.out.println("Byte " + myVal10);
		System.out.println("Short " + myVal11);
		System.out.println("Integer " + myVal12);
		System.out.println("Long " + myVal13);
		System.out.println("Float " + myVal14);
		System.out.println("Double " + myVal15);
		System.out.println("Character " + myVal16);
	}
}