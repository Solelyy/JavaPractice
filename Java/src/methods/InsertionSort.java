package methods;
import java.util.Arrays;

public class InsertionSort {
    /* Challenge:
       Given an array: 10, 63, 1, 9, 7, 5, 23.
       Sort the array using Insertion Sort algorithm.
     */
    public static void insertionSort(int[] arr) {
        int arrayLength = arr.length;

        for (int i = 1; i < arrayLength; i++) {
            int key = arr[i]; // current element to be inserted
            int j = i - 1;

            // Shift elements that are greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key at the correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 63, 1, 9, 7, 5, 23};

        System.out.println("Before sorting: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("After sorting:  " + Arrays.toString(array));
    }
}
