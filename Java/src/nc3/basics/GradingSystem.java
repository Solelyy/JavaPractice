package nc3.basics;

import java.util.Scanner;

public class GradingSystem {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your score (0-100): ");
        int grade = input.nextInt();

        if (grade > 100 || grade < 0) {
            System.out.println("Invalid  grade. Please try again.");
        } else if (grade >= 90) {
            System.out.println("Grade A");
        } else if (grade >= 80 ) {
            System.out.println("Grade B");
        } else if (grade >= 70) {
            System.out.println("Grade C");
        } else if (grade >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }
}