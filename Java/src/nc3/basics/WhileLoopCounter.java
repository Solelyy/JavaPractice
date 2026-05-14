package nc3.basics;

import java.util.Scanner;

public class WhileLoopCounter {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        byte counter = 1;

        while(counter <= number) {
            System.out.println(counter);
            counter ++;
        }
    }
}