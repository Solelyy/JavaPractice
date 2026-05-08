package nc3.basics;

import java.util.Scanner;

public class DescendingPrinter {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i= number; i >=1 ; i--) {
            System.out.println(i);
        }
    }
}
