package nc3.basics;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble();

        //Calculations
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;
        double quotient = firstNumber / secondNumber;
        double remainder = firstNumber % secondNumber;

        System.out.println("Results: ");
        System.out.println("Sum: "+ sum );
        System.out.println("Difference: "+ difference );
        System.out.println("Product: "+ product );

        if (secondNumber != 0) {
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Quotient: Cannot divide by zero.");
            System.out.println("Remainder: Cannot modulo by zero.");
        }
    }
}
