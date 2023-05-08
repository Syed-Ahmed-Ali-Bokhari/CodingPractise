package array;

import java.util.ArrayList;
import java.util.List;

public class spiralTraverse97 {
//	Spiral Traverse 0
//	Write a function that takes in an n x m two-dimensional array (that can be square-shaped when n == m) and returns a
//	one-dimensional array of all the array's elements in spiral order.
//	Spiral order starts at the top left corner of the two-dimensional array, goes to the right, and proceeds in a spiral
//	pattern all the way until every element has been visited.
//	Sample Input
//	array
//= l
//[1,
//		2,
//		3, 41,
//		[12, 13, 14, 51,
//		[11, 16, 15, 6],
//		[10,
//		9, 8, 71,
//		1
//	Sample Output
//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 161
	public static List<Integer> spiralTraverse(int[][] array) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Integer startRow = 0;
		Integer startCol = 0;
		Integer endCol = array[0].length - 1;
		Integer endRow = array.length - 1;
		while (startRow <= endRow && startCol <= endCol) {
			for (int col = startCol; col <= endCol; col++) {
				result.add(array[startRow][col]);
			}
			for (int row = startRow + 1; row <= endRow; row++) {
				result.add(array[row][endCol]);
			}
			for (int col = endCol - 1; col >= startCol; col--) {

				if (startRow == endRow)
					break;
				result.add(array[endRow][col]);
			}
			for (int row = endRow - 1; row > startRow; row--) {

				if (startCol == endCol)
					break;
				result.add(array[row][startCol]);
			}

			startRow++;
			startCol++;
			endRow--;
			endCol--;
		}
		return result;
	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		List<Integer> result = spiralTraverse97.spiralTraverse(arr);
		for(int i=0;i<result.size();i++){
		    System.out.print(result.get(i));
		} 
	}

}
