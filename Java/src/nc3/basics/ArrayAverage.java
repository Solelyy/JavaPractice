package nc3.basics;

public class ArrayAverage {

    public static void main(String[] args) {

        int[] arr1 = {10, 15, 20, 25, 30};

        System.out.println("Test Data 1: Average = " + calculateAverage(arr1));

        int[] arr2 = {5, 5, 5, 5, 5};
        System.out.println("Test Data 2: Average = " + calculateAverage(arr2));
    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }
}
