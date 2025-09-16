package collections.queue;

import java.util.Scanner;
import java.util.Queue;

public class LinkedListDemo {
    /*
    Challenge:
    1. Ask the user how many customers are in line.
    2. Store the customer names in a Queue (use LinkedList<String>).
    3. Print the first customer using peek().
    4. Serve customers one by one using poll(), printing:
       "Serving: <name>"
    5. After serving all, print: "No more customers in queue."
     */
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);

        Queue <String> customers = new java.util.LinkedList<>();

        System.out.print("How many customers are in line?: ");
        int customerCount = sc.nextInt();

        for (int i= 0; i < customerCount; i++){
            System.out.printf("Customer %d: ", i+1);
            String customer= sc.next();

            customers.offer(customer);
        }

        System.out.printf("\nFirst customer in line: %s\n", customers.peek());

        System.out.println();
        while (!customers.isEmpty()){
            System.out.printf("Serving: %s\n", customers.poll());
        }

        System.out.println();
        if (customers.isEmpty()) System.out.println("No more customers in queue.");
    }
}
