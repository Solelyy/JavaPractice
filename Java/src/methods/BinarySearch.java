package methods;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    /* Challenge:
    Find the position of the number in the given array using binary search.
     */
    public static int binarySearch(int [] arr , int target) {
        int left = 0;
        int right = arr.length -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid; // found
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid -1;
        }
        return -1; // not found
    }

    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);

        int [] array = {10, 63, 1, 9, 7, 5, 23};
        Arrays.sort(array);

        System.out.println("Array: " + Arrays.toString(array));
        System.out.print("Enter a number to search using binary search: ");
        int target = sc.nextInt();

        int result = binarySearch(array, target);
        if (result != -1)
            System.out.println("Number found at index: " + result);
        else
            System.out.println("Number not found.");
    }
}
