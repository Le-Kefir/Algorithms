package Sorting;

public class InsertionSort {

    public static void sort(int[] array) {

        int n = array.length;
        int temp;

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {

                if (array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }

            }

        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

}
