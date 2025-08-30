package basics;

import java.util.Scanner;

public class InputAndArithmeticOperator {
    public static void main (String [] args) {
        Scanner scanner= new Scanner(System.in);
        int firstNum;
        int secondNum;
        int sum;

        System.out.println("Let's add two numbers!");
        System.out.print("Enter a number: ");
        firstNum=scanner.nextInt();
        System.out.print("Enter another number: ");
        secondNum=scanner.nextInt();

        sum= firstNum + secondNum;
        System.out.println("Add " + firstNum + " + " + secondNum + " = " + sum);
    }
}
