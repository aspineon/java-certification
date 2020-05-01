package _0013_while_statement;

public class MainApp {

	int roomInBelly = 3;

	public void eatCheese(int bitesOfCheese) {
		
		while (bitesOfCheese > 0 && roomInBelly > 0) {

			System.out.println("bitesOfCheese: " + bitesOfCheese); 
			System.out.println("roomInBelly: " + roomInBelly); 
			System.out.println("this.roomInBelly: " + this.roomInBelly); 
			System.out.println("--------------------------------" ); 

			bitesOfCheese--;
			roomInBelly--;
		}
		
		System.out.println("bitesOfCheese: " + bitesOfCheese); 
		System.out.println("roomInBelly: " + roomInBelly); 
		System.out.println("this.roomInBelly: " + this.roomInBelly); 
	}

	public static void main(String[] args) {
		MainApp obj = new MainApp();
		obj.eatCheese(12);
	}
}