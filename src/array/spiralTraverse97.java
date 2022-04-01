package array;

import java.util.ArrayList;
import java.util.List;

public class spiralTraverse97 {

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
		    System.out.println(result.get(i));
		} 
	}

}
