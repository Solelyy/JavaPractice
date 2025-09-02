package collections.list;

import java.util.LinkedList;

public class LinkedListDemo {
    /*
    Challenge: Student Queue
    1. Create a LinkedListDemo<String> called students.
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
        //1.
        LinkedList <String> students = new java.util.LinkedList<>();

        //2.
        students.add("Dinavel");
        students.add("Jamaica");
        students.add("Ginger");
        students.add("Khym");
        students.add("Jessa");

        //3.
        System.out.println("Students: " + students);

        //4.
        System.out.println("\nRemoving first student: " + students.removeFirst());

        //5.
        System.out.println("Removing last student: " + students.removeLast());

        //6.
        System.out.println("\nUpdated list: " + students);

        //7.
        System.out.println("\nFirst in queue: " + students.getFirst());
        System.out.println("Last in queue: " + students.getLast());

        //8 & 9
        students.addFirst("Taylor");
        students.addLast("Sabrina");
        System.out.printf("\nAdding new students: \nFirst: %s\nLast: %s", students.getFirst(), students.getLast());

        //10.
        System.out.println("\n\nUpdated list: " + students);
    }
}
