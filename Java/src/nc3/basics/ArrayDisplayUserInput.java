package nc3.basics;

import java.util.Scanner;

public class ArrayDisplayUserInput {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();

        numbers[0] = number1;
        numbers[1] = number2;
        numbers[2] = number3;
        numbers[3] = number4;
        numbers[4] = number5;

        System.out.println();
        System.out.println("You entered:");
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
