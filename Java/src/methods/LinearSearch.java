package methods;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    /*Challenge:
    Given an array: 10, 63, 1, 9, 7, 5, 23.
    Find the number entered by the user using linear search.
     */
    public static int linearSearch(int [] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // found
            }
        }
        return -1; // not found
    }
    public static void main (String [] args) {
        Scanner sc= new Scanner(System.in);
        int [] array = {10, 63, 1, 9, 7, 5, 23};
        System.out.println("Array: "
                + Arrays.toString(array));

        System.out.print("Enter a number to search using linear search: ");
        int target = sc.nextInt();

        int result = linearSearch(array, target);
        if (result != -1)
            System.out.println("Number found at index: " + result);
        else
            System.out.println("Number not found.");
    }
}
