package _0018_return_statement;

public class FindInMatrixUsingReturn {
	
	private static int[] searchForValue(int[][] myList, int myValue) {
		
		for (int i = 0; i < myList.length; i++) {
		
			for (int j = 0; j < myList[i].length; j++) {
				
				if (myList[i][j] == myValue) {
					return new int[] { i, j };
				}
				
			}
		}
		return null;
	}

	
	public static void main(String[] args) {
		
		int[][] myList = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		
		int searchValue = 3;
		
		int[] results = searchForValue(myList, searchValue);
		
		if (results == null) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: [" + results[0] + "," + results[1] + "]");
			// Value 3 found at: [1,0]
		}
		
	}
}