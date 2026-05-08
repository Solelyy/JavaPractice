package nc3.basics;

import java.util.Scanner;

public class OddOrEvenChecker {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

         String result = number % 2 == 0 ? "even" : "odd";

        System.out.printf("%d is %s.", number, result);
    }
}
