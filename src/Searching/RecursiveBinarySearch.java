package Searching;


public class RecursiveBinarySearch {

    public static int search(int[] array, int x) {
        return search(array, x, 0, array.length-1);
    }


    private static int search(int[] array, int x, int lower, int upper) {
        int mid = (lower + upper) / 2;

        if (x == array[mid]) {
            return mid;
        }  else if (x < array[mid]) {
            return search(array, x, lower, mid-1);
        } else {
            return search(array, x, mid+1, upper);
        }

    }

}
