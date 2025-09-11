package collections.set;

import java.util.Scanner;
import java.util.HashSet;

public class HashSetDemo {
    /*
    1. Stores a list of student names.
    2. Ensures no duplicate names are added.
    3. Lets the user search if a student is in the set.
    4. Prints all students in the set.
     */
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashSet <String> students = new HashSet<>();
        System.out.println("Enter students name: ");
        while (true) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            students.add(name);
            System.out.print("Add another? [y/n]: ");
            String choice = sc.nextLine();
            if (!choice.equalsIgnoreCase("y")) break;
        }

        System.out.print("Names: ");
        for (String s: students) System.out.printf("%s ", s);
        System.out.println();

        System.out.print("\nSearch a name: ");
        String searchName = sc.nextLine();
        boolean found = students.stream()
                .anyMatch(s -> s.equalsIgnoreCase(searchName));
        System.out.println(found ? "Found!" : "Not Found.");
    }
}