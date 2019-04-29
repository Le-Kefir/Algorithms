package Searching;


public class IterativeBinarySearch {

    public static int search(int[] array, int x) {
        int lower = 0;
        int upper = array.length-1;
        while (lower < upper) {
            int mid = lower + ((upper - lower) / 2);
            if (array[mid] == x) {
                return mid;
            } else if (x < array[mid]) {
                upper = mid - 1;
            } else {
                lower = mid + 1;
            }
        }
        return -1;
    }

}

