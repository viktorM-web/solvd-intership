package homework1;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        int[] unsortedArray = {9, 10, 8, 5, 2, 1, 3, 14, 56, 17, 21};
        int[] unsortedArray2 = {21};

        InsertionSort.sort(unsortedArray);
        InsertionSort.sort(unsortedArray2);

        System.out.println(Arrays.toString(unsortedArray));
        System.out.println(Arrays.toString(unsortedArray2));
    }
}
