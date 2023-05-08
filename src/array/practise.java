package array;

import java.util.*;

public class practise {


    public static void main(String[] args) {

        int[] array = new int[] { 3, 5, -4, 8, 11, 1, -1, 6 };

        int[] result = practise.twoNumberSum(array, 10);
        for (int res : result)
            System.out.println(res);

    }




}