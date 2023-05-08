package array;

import java.util.*;

public class practise {
//    smallest common number in a sorted array
//    int[] array1 = new int[]{6, 21, 77, 88};
//    int[] array2 = new int[]{1, 2, 6};
//    int[] array3 = new int[]{0, 4, 5, 6};
//
//    out put ==> 6

    public static void main(String[] args) {

        int[] array1 = new int[]{6, 21, 77, 88};
        int[] array2 = new int[]{1, 2, 6};
        int[] array3 = new int[]{0, 4, 5, 6};

        System.out.println(practise.commonNumber(array1, array2, array3));

    }

    private static int commonNumber(int[] array1, int[] array2, int[] array3) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array1.length && j < array2.length && k < array3.length) {
            if (array1[i] < array2[j] && array1[i] < array3[k])
                i++;
            else if (array2[j] < array1[i] && array2[j] < array3[k])
                j++;
            else if (array3[k] < array2[j] && array3[k] < array1[i])
                k++;

            if (array1[i] == array2[j] && array2[j] == array3[k])
                return array1[i];
        }


        return -1;
    }


}