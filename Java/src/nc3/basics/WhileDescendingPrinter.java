package nc3.basics;

import java.util.Scanner;

public class WhileDescendingPrinter {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int i = number;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
