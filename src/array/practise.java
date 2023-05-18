package array;

import java.util.*;

public class practise {


    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> result = practise.spiralTraverse(arr);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        }
    }

    private static List<Integer> spiralTraverse(int[][] arr) {
        List<Integer> result = new ArrayList<Integer>();
        int startRow = 0;
        int startColumn = 0;
        int row = arr.length - 1;
        int columnEnd = arr[0].length - 1;
        while (startRow < row && startColumn < columnEnd) {
            for (int i = startColumn; i <= columnEnd; i++) {
                result.add(arr[startRow][i]);
            }
            for (int i = startRow + 1; i <= columnEnd; i++) {
                result.add(arr[i][columnEnd]);
            }
            for (int i = columnEnd - 1; i >= startColumn; i--) {
                result.add(arr[row][i]);
            }
            for (int i = row - 1; i > startRow; i--) {
                result.add(arr[i][startColumn]);
            }
            startColumn--;
            startRow++;
        }

        return result;
    }


}