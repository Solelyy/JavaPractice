package oop.interfaces;

public class Circle implements Shape {
    double radius;
    String shapeName;
    final double pie= 3.14;

    Circle (String shapeName, double radius) {
        this.shapeName= shapeName;
        this.radius= radius;
    }

    @Override
    public double calculateArea(){
        double radiusSquared= radius * radius;
        double area= pie * radiusSquared;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = pie * 2 * radius;
        return perimeter;
    }

    @Override
    public void displayInfo(){
        System.out.printf("%nShape: %s%nArea: %.2f%nPerimeter: %.2f",
                shapeName, calculateArea(), calculatePerimeter());
    }
}
