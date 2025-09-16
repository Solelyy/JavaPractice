package collections.queue;

import java.util.Scanner;
import java.util.Queue;

public class PriorityQueueDemo {
    /*
    Challenge:
    1. Ask the user how many tasks to add.
    2. Each task has:
        -A name (string)
        -A priority (integer, where smaller number = higher priority)
    3. Store tasks in a PriorityQueue.
    4. You’ll need to make a small Task class that implements Comparable<Task> so the queue knows how to order them.
    5. Print the task that will be executed first (peek()).
    6. Then process tasks one by one using poll(), printing:
       "Processing: <taskName> (priority <priority>)"
    7. When all tasks are processed, print: "All tasks completed."
     */

    public static void main (String [] args) {
        Scanner sc= new Scanner(System.in);
        Queue <Task> tasks = new java.util.PriorityQueue<>();

        System.out.print("How many tasks to add?: ");
        int taskCount = sc.nextInt();
        sc.nextLine();

        for (int i= 0; i < taskCount; i++){
            System.out.printf("Task %d name: ", i+1);
            String name= sc.next();
            System.out.print("Priority: ");
            int priority= sc.nextInt();

            sc.nextLine();
            tasks.offer(new Task(name, priority));
        }

        System.out.println();
        System.out.printf("First task to execute: %s\n", tasks.peek());

        System.out.println();
        while (!tasks.isEmpty()) {
            System.out.printf("Processing: %s\n", tasks.poll());
        }

        System.out.println();
        System.out.println("All tasks completed.");
    }
}
