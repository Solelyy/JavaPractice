package mini_projects;

import java.util.Scanner;

public class QuizGame {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        String userAnswer;
        boolean answeredRight= false;
        String rightAnswer= "Bangkok";
        int chance = 10;

        System.out.println("Let's play a quiz game! You have 10 lives and every " +
                "wrong answer it will be deducted by 1. ");
        System.out.println();

        while (!answeredRight && chance > 0){
            System.out.print("What is the capital of Thailand? " );
            userAnswer= scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(rightAnswer)) {
                System.out.println("Genius! Your answer is correct!");
                answeredRight= true;
            } else {
                chance --;
                if (chance > 0) {
                    System.out.println("Try again. Chances left are: " + chance);
                } else {
                    System.out.println("No more chances left. Better luck next time!");
                }
            }
            System.out.println();
        }
    }
}