package array;

import java.util.*;

public class practise {

    // Reverse words in a String


    public static void main(String[] args) {

        int[] array = new int[]{1, 3, 5, 7};
        int[] array1 = new int[]{2, 4, 6, 8, 10, 12};
        int[] result = practise.sortArray(array, array1);
        for (int res : result)
            System.out.println(res);

    }

    private static int[] sortArray(int[] array, int[] array1) {
        int[] result = new int[array.length + array1.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array.length && j < array1.length) {

            if (array[i] < array1[j])
                result[k++] = array[i++];
            else
                result[k++] = array1[j++];

        }
        while (i < array.length)
            result[k++] = array[i++];
        while (j < array1.length)
            result[k++] = array1[j++];

        return result;
    }


}
