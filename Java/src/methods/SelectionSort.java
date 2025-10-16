package methods;
import java.util.Arrays;

public class SelectionSort {
    /* Challenge:
       Given an array: 10, 63, 1, 9, 7, 5, 23.
       Sort the array using the Selection Sort algorithm.
     */
    public static void selectionSort (int [] arr) {
        int arrayLength = arr.length;

        //Go through each element
        for (int i = 0; i < arrayLength - 1; i++){
            //assume the smallest value is in position i
            int minIndex = i;

            //find the actual smallest
            for (int j = i + 1; j < arrayLength; j++ ){
                if (arr[j] < arr[minIndex])
                    minIndex = j; //found smaller element
            }

            //swap the found smallest with the element at position i
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 63, 1, 9, 7, 5, 23};

        System.out.println("Before sorting: " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("After sorting:  " + Arrays.toString(array));
    }
}
