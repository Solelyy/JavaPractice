package nc3.basics;

import java.util.Scanner;

public class LargestNumberFinder {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();

        System.out.print("Enter third number: ");
        int thirdNum = input.nextInt();
        int largestNum;

        System.out.println();
        if (firstNum == secondNum && secondNum == thirdNum) {
            System.out.println("All numbers are equal. ");
        } else {
            if (firstNum > secondNum && firstNum > thirdNum) {
                largestNum = firstNum;
            } else if (secondNum > thirdNum) {
                largestNum = secondNum;
            } else {
                largestNum = thirdNum;
            }
            System.out.println("The largest number is: " + largestNum);
        }

    }
}