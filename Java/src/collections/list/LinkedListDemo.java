package collections.list;

import java.util.LinkedList;

public class LinkedList {
    /*
    Challenge: Student Queue
    1. Create a LinkedList<String> called students.
    2. Add at least 5 student names to the queue.
    3. Print the queue.
    4. Remove the first student (served) and show who was removed.
    5. Remove the last student (decided not to enroll).
    6. Print the updated queue.
    7. Print the first and last student in the queue after all operations.
    8. Add a new student at the front (priority student).
    9. Add another student at the end (late enrollee).
    10. Print the updated queue.

     */
    public static void main (String args[]){
        LinkedList <String> students = new java.util.LinkedList<>();
        students.add("Dinavel");
        students.add("Jamaica");
        students.add("Ginger");
        students.add("Khym");
        students.add("Jessa");

        System.out.println("Students: ");
        for (String student: students) System.out.printf("%s%n", student);

        System.out.println("\nRemoving first student: " + students.getFirst());
        System.out.println("Removing last student: " + students.getLast());
        students.removeFirst();
        students.removeLast();

        System.out.println("\nUpdated list: ");
        for (String student: students) System.out.printf("%s%n", student);

        System.out.println("\nFirst in queue: " + students.getFirst());
        System.out.println("Last in queue: " + students.getLast());

        students.addFirst("Taylor");
        students.addLast("Sabrina");
        System.out.printf("\nAdding new students: \nFirst: %s\nLast: %s", students.getFirst(), students.getLast());


        System.out.println();
        System.out.println("\nUpdated list: ");
        for (String student: students) System.out.printf("%s%n", student);
    }
}
