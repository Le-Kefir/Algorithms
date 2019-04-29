package Sorting;

public class MergeSort {

    public static void sort(int[] array) {

        merge(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    private static void merge(int[] array, int start, int end) {
        int mid = (start + end) / 2;
        if (start < end) {
            merge(array, start, mid);
            merge(array, mid + 1, end);
        }

        int i = 0;
        int first = start;
        int last = mid + 1;
        int[] temp = new int[end - start + 1];

        while (first <= mid && last <= end) {
            temp[i++] = array[first] < array[last] ? array[first++] : array[last++];
        }

        while (first <= mid) {
            temp[i++] = array[first++];
        }

        while (last <= end) {
            temp[i++] = array[last++];
        }

        i = 0;
        while (start <= end) {
            array[start++] = temp[i++];
        }

    }

}
