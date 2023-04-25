package recursion;

public class binarySearchUsingRecursion13 {

    // Reverse words in a String

    public static void bubbleSort(int[] array, int n) {
        if (n == 1 || n == 0)
            return;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        bubbleSort(array, n - 1);
    }

    public static void main(String[] args) {

        int[] array = new int[]{5, 4, 3, 2, 1};
        int n = array.length;
        binarySearchUsingRecursion13.bubbleSort(array, n);
        for (int i : array) {
            System.out.println(i);
        }
    }

}
