package _0012_overriding_accessible;

public class Snake extends Reptile {

	protected boolean hasLegs() {
		return false;
	}

	protected double getWeight() throws InsufficientDataException {
		return 2;
	}

	protected double getHeight() throws Exception { // DOES NOT COMPILE
		return 2;
	}

	protected int getLength() throws InsufficientDataException { // DOES NOT COMPILE
		return 10;
	}

	public static void main(String[] args) throws InsufficientDataException {
		Snake snake = new Snake();
		System.out.println(snake.hasLegs());
		System.out.println(snake.getWeight());
	}
}
