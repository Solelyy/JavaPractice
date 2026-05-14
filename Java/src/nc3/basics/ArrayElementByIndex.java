package nc3.basics;

import java.util.Scanner;

public class ArrayElementByIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};
        boolean isValid = false;
        do {
            System.out.print("Enter an index (0-4): ");
            int index = input.nextInt();

            if (index > 4 || index < 0) {
                System.out.println("Invalid index! Please enter a number between 0 and 4.\n");
            } else {
                System.out.printf("The value at index %d is: %d", index, numbers[index]);
                isValid = true;
            }
        } while (!isValid);

    }
}
