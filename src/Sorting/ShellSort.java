package Sorting;

public class ShellSort {

    public static void sort(int[] array) {

        int h = 1;
        while (h <= array.length / 3) {
            h = 3 * h + 1;
        }

        while (h > 0) {
            for (int i = 0; i < array.length; i++) {

                int temp = array[i];
                int j;

                for (j = i; j > h - 1 && array[j - h] >= temp; j = j - h) {
                    array[j] = array[j - h];
                }

                array[j] = temp;

            }
            h = (h - 1) /3 ;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

//        return array;



    }



}
