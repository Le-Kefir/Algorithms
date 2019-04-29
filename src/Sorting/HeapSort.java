package Sorting;

public class HeapSort {

    public static void sort(int[] array) {
        int n = array.length;

        for (int i = n/2 - 1; i >= 0; i--) {
            heap(array, n, i);
        }

        for (int i = n-1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heap(array, i, 0);
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    private static void heap(int[] array, int length, int i) {
        int max = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < length && array[left] > array[max]) {
            max = left;
        }

        if (right < length && array[right] > array[max]) {
            max = right;
        }

        if (max != i) {
            int swap = array[i];
            array[i] = array[max];
            array[max] = swap;

            heap(array, length, max);

        }
    }

}
