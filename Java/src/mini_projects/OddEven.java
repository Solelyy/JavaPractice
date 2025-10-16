package mini_projects;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEven{
    //Challenge: Identify if the integer given by the user is odd or even.
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        try{
            for (int i= 0; i < 5; i++) {
                System.out.print("Enter a number: ");
                int num= sc.nextInt();

                if (num % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            }
        } catch (InputMismatchException e){
            System.out.println("Enter an integer only.");
        }
    }
}
