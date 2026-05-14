package nc3.basics;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = {5, 12, 7, 9, 23, 18};

        System.out.print("Enter a number to search: ");
        int searchNumber = input.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == searchNumber) {
                System.out.printf("Number %d found at index %d", searchNumber, i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.printf("Number %d not found in the array.", searchNumber);
        }
    }
}