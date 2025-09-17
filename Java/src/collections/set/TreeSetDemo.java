package collections.set;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetDemo {
    /*
    Challenge:
    1. Stores a list of numbers entered by the user.
    2. Prints them in ascending order (default).
    3. Prints them in descending order (using descendingSet()).
    4. Finds the smallest and largest number in the set.
     */
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet <Integer> numbers = new TreeSet<>();

        System.out.print("How many numbers u like to enter?: ");
        int count = sc.nextInt();
        sc.nextLine();

        System.out.println();

        for (int i = 0; i < count; i++){
            System.out.printf("Number %d: ", i+1);
            int number = sc.nextInt();
            sc.nextLine();
            numbers.add(number);
        }
        System.out.print("Numbers in ascending order: ");
        String ascResult = numbers.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", "));
        System.out.print(ascResult);

        System.out.println();
        System.out.print("Numbers in descending order: ");
        String descResult = numbers.descendingSet().stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.print(descResult);

        System.out.println();
        System.out.println("Smallest number: " + numbers.first());
        System.out.println("Largest number: " + numbers.last());
    }
}
