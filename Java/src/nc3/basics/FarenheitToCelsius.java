package nc3.basics;

import java.util.Scanner;

public class FarenheitToCelsius {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit-32) * 5/9;

        System.out.printf("Temperature in Celsius: %.2f°C", celsius);
    }
}
