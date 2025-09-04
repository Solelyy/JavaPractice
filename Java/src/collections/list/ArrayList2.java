package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayList2 {
    //Challenge: Ask user to input 5 numbers and find the largest.
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        List numbers = new ArrayList<>();

        int loop = 5;
        System.out.println("Enter 5 numbers.");
        System.out.println();

        for (int i= 0; i < loop; i++) {
            System.out.printf("Number %d: ", i+1);
            int userInput = sc.nextInt();
            numbers.add(userInput);
        }

        System.out.print("Numbers: ");
        for (Object num: numbers) {
            System.out.printf("%d ", num);
        }

        System.out.println();
        int largestNum= (int) Collections.max(numbers);
        System.out.printf("Largest number: %d ", largestNum);
    }
}
