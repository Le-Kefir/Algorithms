package Sorting;

public class BubbleSort {

    public static void sort(int[] array) {

        int length = array.length;
        int temp = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {

                if (array[j-1] > array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }

            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

}
