package mini_projects;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = scanner.nextInt();

        // Check if the user enters less than 2 numbers
        if (n < 2) {
            System.out.println("You need at least 2 numbers to find the second largest.");
            return;
        }

        int[] numbers = new int[n];

        // Input numbers
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display entered numbers
        System.out.print("Numbers entered: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        // Output result
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("All numbers are equal. No second largest value.");
        } else {
            System.out.println("Largest number: " + largest);
            System.out.println("Second largest number: " + secondLargest);
        }

        scanner.close();
    }
}

