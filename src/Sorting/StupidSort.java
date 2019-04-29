package Sorting;

public class StupidSort {

    public static void sort(int[] array) {

        int length = array.length;
        int index = 0;

        while (index < length) {
            if (index == 0) {
                index++;
            }

            if (array[index] >= array[index - 1]) {
                index++;
            } else {
                int temp = 0;
                temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

}
