package collections.set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.HashSet;

public class LinkedHashSetDemo {
    /*
    1. Stores the names of people entering a room (simulate with add).
    2. Prints the names in the order they entered.
    3. Then, try removing one person and show the updated set.
    4. Search for a name and print the result if found or not.
     */
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashSet <String> names = new LinkedHashSet<>();

        System.out.println("Enter names: ");
        while (true) {
            System.out.print("Name: ");
            String name = sc.nextLine();

            names.add(name);

            System.out.print("Add another? [y/n]: ");
            String choice = sc.nextLine();
            if (!choice.equalsIgnoreCase("y")) break;
        }

        String printNames = String.join(", ",names);
        System.out.print("Names: " + printNames);

        System.out.print("\nRemove name: ");
        String removeName = sc.nextLine();
        boolean isFound = names.stream().anyMatch(name -> name.equalsIgnoreCase(removeName));
        if (isFound) {
            names.remove(removeName);
            System.out.printf("\nRemoving %s in the list...", removeName);
        } else {
            System.out.println("Name not found.");
        }

        String printUpdatedNames = String.join(", ",names);
        System.out.println("\nNames: " + printUpdatedNames);

        System.out.print("\nSearch name: ");
        String searchName = sc.nextLine();
        boolean found = names.stream().anyMatch(name -> name.equalsIgnoreCase(searchName));
        System.out.print(found ? "Found!" : "Not Found.");
    }
}
