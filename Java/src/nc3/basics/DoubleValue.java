package nc3.basics;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleValue {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[4];
        int[] doubleValues = new int[4];

        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();

        System.out.print("Enter third number: ");
        int thirdNum = input.nextInt();

        System.out.print("Enter fourth number: ");
        int fourthNum = input.nextInt();

        numbers[0] = firstNum;
        numbers[1] = secondNum;
        numbers[2] = thirdNum;
        numbers[3] = fourthNum;

        System.out.println();
        System.out.println("Input numbers: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++ ) {
            doubleValues[i] = numbers[i] + numbers[i];
        }

        System.out.println("Doubled Value: " + Arrays.toString(doubleValues));
    }
}
