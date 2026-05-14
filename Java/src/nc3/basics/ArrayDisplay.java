package nc3.basics;

import java.util.Scanner;

public class ArrayDisplay {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = {12, 25, 37, 44, 59};
        byte greaterThanThirty = 0;

        System.out.println("Array contents:");
        for (int number : numbers) {
            System.out.println(number);
            if (number > 30) {
                greaterThanThirty += 1;
            }
        }

        System.out.println("\nThe count of numbers greater than 30: " + greaterThanThirty);
    }
}
