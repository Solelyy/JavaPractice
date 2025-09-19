package extras;

import java.util.LinkedList;
import java.util.Scanner;

public class LambdaDemo {
    /*
    Challenge:
    You have a list of integers. Use lambdas to:
    1. Print all numbers.
    2. Print only the even numbers.
    3. Print the square of each number.
     */
    public static void main (String [] args) {
        LinkedList <Integer> numbers = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers would u like?: ");
        int count= sc.nextInt();
        sc.nextLine();
        System.out.println();

        for (int i= 0; i<count; i++){
            System.out.printf("Number %d: ", i+1);
            int number = sc.nextInt();
            numbers.add(number);
        }

        System.out.print("\nAll numbers: ");
        numbers.forEach(number -> System.out.printf("%d ", number));

        System.out.print("\nEven numbers: ");
        numbers.forEach(number -> {
            if (number % 2 == 0) {
                System.out.printf("%d ",number);
            }
        });

        System.out.println("\nSquare of each number: ");
        numbers.forEach(number -> {
            double square = number * number;
            System.out.printf("%d = %.2f\n", number, square);
        });
    }
}
