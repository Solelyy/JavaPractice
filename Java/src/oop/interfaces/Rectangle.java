package oop.interfaces;

public class Rectangle implements Shape {
    double length, width;
    String shapeName;

    Rectangle (String shapeName, double length, double width) {
        this.shapeName= shapeName;
        this.length= length;
        this.width= width;
    }

    @Override
    public double calculateArea() {
        double area= length * width;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double add = length + width;
        double perimeter= 2 * add;
        return perimeter;
    }

    @Override
    public void displayInfo() {
        System.out.printf("%nShape: %s%nArea: %.2f%nPerimeter: %.2f",
                shapeName, calculateArea(), calculatePerimeter());
    }
}
