package extras;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main (String [] args ){
        Scanner s= new Scanner(System.in);

        do {
            try {
                System.out.print("Enter a number: ");
                int number= s.nextInt();

                int square= number * number;
                System.out.printf("Number: %d%nSquare: %d", number, square);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Input numbers only.");
                s.nextLine();
            }
        } while (true);
    }
}

