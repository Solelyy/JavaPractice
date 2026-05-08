package nc3.basics;

import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double length = input.nextDouble();

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        double area = length * width;

        System.out.println("The area of the rectangle is: " + area);
    }
}
