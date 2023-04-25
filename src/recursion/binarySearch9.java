package recursion;

public class binarySearch9 {

    // Reverse words in a String

    public static boolean binarySearch(int[] arr, int start, int end, int key) {

        int mid = (start + end) / 2;
        if (start > end)
            return false;

        if (arr[mid] == key)
            return true;

        if (arr[mid] < key)
            return binarySearch(arr, mid + 1, end, key);
        else
           return binarySearch(arr, start, mid - 1, key);

    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 10, 14, 18};
        int key = 2;
        System.out.println(binarySearch9.binarySearch(arr, 0, arr.length - 1, key));

    }

}
