package _0018_optional_labels;

public class MainApp2_break {

	public static void main(String[] args) {
		
		int[][] list = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		
		int searchValue = 3;
		int positionX = -1;
		int positionY = -1;
		
		PARENT_LOOP: for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					break PARENT_LOOP;
				}
			}
		}
		
		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "[" + positionX + "," + positionY + "]");
			//	Value 3 found at: (0,1)
		}
		
	}
}
