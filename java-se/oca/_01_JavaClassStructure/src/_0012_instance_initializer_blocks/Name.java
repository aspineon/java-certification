package _0012_instance_initializer_blocks;

public class Name {

	String first = "Lena";
	String last = "Katerina";
	String full = first + last;

	public static void main(String[] args) {
		
		
		System.out.println("1");

		{
			System.out.println("-> 2");
		}
		
		System.out.println("3");

		Name nameObj = new Name(); //	---->  4  	---->  5
		
		{
			System.out.println("-> 6");
		}
		
		Name nameObj2 = new Name(); //	---->  4  	---->  5

		
		System.out.println("7");
		
		{
			System.out.println("-> 8");
		}

	}

	{
		System.out.println("----> 4");
	}
	
	{
		System.out.println("----> 5");
	}
}