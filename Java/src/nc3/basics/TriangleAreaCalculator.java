package nc3.basics;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = input.nextDouble();

        System.out.print("Enter the height: ");
        double height = input.nextDouble();

        double area = (base * height)/2;

        System.out.println("The area of the triangle is: " + area);
    }
}
