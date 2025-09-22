package extras;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main (String [] args ){
        Scanner s= new Scanner(System.in);

        do {
            try {
                System.out.print("Enter a number: ");
                double number= s.nextDouble();

                double square= number * number;
                System.out.printf("Number: %.2f%nSquare: %.2f", number, square);
                System.out.println();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Input numbers only.");
                s.nextLine();
            } finally {
                // This always runs even with or without error
                System.out.println("\nProgram finished.");
            }
        } while (true);
    }
}

