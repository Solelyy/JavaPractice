package oop.enums;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to QCU Cafe!");
        System.out.print("Enter coffee size [SMALL / MEDIUM / LARGE]: ");
        String size= scanner.nextLine().toUpperCase();

        try {
            CoffeeSize coffeeSize = CoffeeSize.valueOf(size);
            System.out.println("You selected: " + coffeeSize);

            System.out.println("Price: " + coffeeSize.getPrice());

        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid Size. Please select between Small, Medium, or Large.");
        }
    }
}