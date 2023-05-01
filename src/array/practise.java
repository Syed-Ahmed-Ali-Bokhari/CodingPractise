package array;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class practise {

    // Reverse words in a String

    public static int[] maxSliding(int[] array, int windowSize) {
        int[] result = new int[array.length - windowSize + 1];

        for (int i = 0; i <= array.length - windowSize; i++) {
            int maxInWindow = Integer.MIN_VALUE;
            for (int j = i; j < i + windowSize; j++) {
                maxInWindow = Math.max(maxInWindow, array[j]);
            }
            result[i] = maxInWindow;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] array = new int[]{-4, 2, -5, 3, 6};
        int windowSize = 3;

        int[] result = practise.maxSliding(array, windowSize);
        for (int res : result)
            System.out.println(res);
    }

}
