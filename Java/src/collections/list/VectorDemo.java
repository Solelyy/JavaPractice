package collections.list;

import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {
    /*
    1. Ask the user to enter N names (N is input by the user).
    2. Store all names in a Vector.
    3. Print the first and last names using firstElement() and lastElement().
    4. Ask the user to enter a name to search.
    5. If it exists, print: "Name found at index: X" (use indexOf(Object o)).
    6. Otherwise, print: "Name not found".
    7. Remove the searched name if it exists (use remove(Object o)).
    8. Print the updated Vector.
     */
    public static void main (String [] args) {
        Scanner sc= new Scanner(System.in);

        Vector <String> names = new Vector<>();

        System.out.print("How many names?: ");
        int nameCount= sc.nextInt();

        sc.nextLine();

        for (int i= 0; i < nameCount; i++) {
            System.out.printf("Name %d: \t", i+1);
            String name = sc.next();
            names.add(name);
        }

        System.out.printf("First entered name: %s\n", names.firstElement());
        System.out.printf("Last entered name: %s\n", names.lastElement());

        System.out.println();
        System.out.print("Search name: ");
        String searchName= sc.next();

        boolean isFound = false;
        for (int i= 0; i < names.size(); i++) {
            String name = names.get(i);
            if (searchName.equalsIgnoreCase(name)) {
                System.out.printf("Name found at index %d.\n", names.indexOf(name));
                System.out.printf("Removing %s.\n", name);
                names.remove(i);
                isFound= true;
                i--;
            }
        }
        if (!isFound) System.out.println("Name not found.\n");

        System.out.print("\nNames: ");
        for (Object name: names) {
            System.out.printf("%s ", name);
        }
    }
}
