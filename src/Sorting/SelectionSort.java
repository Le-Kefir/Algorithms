package Sorting;

public class SelectionSort {

    public static void sort(int[] array) {

        int n = array.length;

        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

}
