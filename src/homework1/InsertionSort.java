package homework1;

public final class InsertionSort {

    private InsertionSort() {
    }

    public static void sort(int[] unsortedArray) {
        int length = unsortedArray.length;
        int[] currentArray = unsortedArray;

        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0 && currentArray[j - 1] > currentArray[j]; j--) {
                int transit = currentArray[j - 1];
                currentArray[j - 1] = currentArray[j];
                currentArray[j] = transit;

            }
        }
    }

}
