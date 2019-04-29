package Searching;

public class ExponentialSearch {

    public static int search(int[] array, int x) {
        int n = array.length;

        if (array[0] == x) {
            return 0;
        }

        int i = 1;
        while (i < n && array[i] <= x) {
            i = i*2;
        }

        return RecursiveBinarySearch.search(array, x, i/2, Math.min(i, n));
    }

}
