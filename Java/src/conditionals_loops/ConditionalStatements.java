package conditionals_loops;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main (String [] args){
        Scanner scanner= new Scanner(System.in);
        float mathGrade;
        float scienceGrade;
        float englishGrade;
        float historyGrade;
        float average;

        System.out.println("Let's compute your grade!");
        System.out.print("Enter Math grade: ");
        mathGrade=scanner.nextFloat();
        System.out.print("Enter Science grade: ");
        scienceGrade=scanner.nextFloat();
        System.out.print("Enter English grade: ");
        englishGrade=scanner.nextFloat();
        System.out.print("Enter History grade: ");
        historyGrade=scanner.nextFloat();

        average= (mathGrade + englishGrade + scienceGrade + historyGrade) / 4;
        System.out.println("Your average grade is " + average );
        if (average > 100 ) {
            System.out.println("Invalid Grade.");
        }
        else if (average >= 98) {
            System.out.println("With Highest Honors!");
        }
        else if (average >= 95) {
            System.out.println("With High Honors!");
        }
        else if (average >= 90) {
            System.out.println("With Honors!");
        }
        else if (average >= 75) {
            System.out.println("Passed!");
        }
        else {
            System.out.println("Failed.");
        }
    }
}
