package oop.interfaces;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scanner= new Scanner(System.in);

        Shape shape;

        System.out.print("Select a Shape [Rectangle/ Circle]: ");
        String shapeName= scanner.nextLine();

        if (shapeName.equalsIgnoreCase("Rectangle")){
            System.out.print("Lenght: ");
            double length= scanner.nextDouble();

            System.out.print("Width: ");
            double width= scanner.nextDouble();

            shape = new Rectangle(shapeName, length, width);
            shape.displayInfo();
        } else {
            System.out.print("Radius: ");
            double radius= scanner.nextDouble();

            shape = new Circle(shapeName, radius);
            shape.displayInfo();
        }
    }
}
