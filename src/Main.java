import Searching.ExponentialSearch;
import Searching.IterativeBinarySearch;
import Searching.LinearSearch;
import Searching.RecursiveBinarySearch;
import Sorting.*;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = { 5, 61, 100, 3, 41, 57, 12, 32, 8, 6};
        int[] sortedArray = {3, 6, 8, 12, 16, 23, 67, 93};

//        System.out.println(ExponentialSearch.search(sortedArray, 16));

        ShellSort.sort(unsortedArray);

    }


}
