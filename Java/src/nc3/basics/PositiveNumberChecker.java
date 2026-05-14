package nc3.basics;

import java.util.Scanner;

public class PositiveNumberChecker {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isPositive = false;
        do {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number < 0) {
                System.out.println("Invalid. Please enter a positive number.");
            } else {
                System.out.println("Thank you! You entered: " + number);
                isPositive = true;
            }
        } while(!isPositive);
    }
}
