package nc3.basics;

import java.util.Scanner;

public class SumCalculator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int totalSum = 0;
        byte i = 1;

        while (i <= number) {
            totalSum += i;
            if (i == number) {
                System.out.printf("%d = ", i);
            } else {
                System.out.printf("%d + ", i);
            }
            i++;
        }

        System.out.println(totalSum);

        System.out.printf("The sum from 1 to %d is: %d", number, totalSum);
    }
}
