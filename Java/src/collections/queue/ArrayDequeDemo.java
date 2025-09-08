package collections.queue;

import java.util.Deque;
import java.util.Scanner;
import java.util.ArrayDeque;
public class ArrayDequeDemo {
    /*
    1. User visits N websites (store them in an ArrayDeque).
    Support:
        back → go to the previous website.
        forward → go to the next website.
    2. Print the current website after each action.
     */
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        Deque <String> backStack = new ArrayDeque<>();
        Deque <String> forwardStack = new ArrayDeque<>();
        String currentPage = null;

        while (true){
            System.out.println("\n--- Browser Menu ---");
            System.out.println("1. Visit a page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter page URL: ");
                    String newPage = sc.nextLine();

                    if (currentPage != null) {
                        backStack.push(currentPage);
                        forwardStack.clear();
                    }

                    currentPage = newPage;
                    System.out.println("Visiting: " + currentPage);
                }

                case 2 -> {
                    if (!backStack.isEmpty()) {
                        forwardStack.push(currentPage);
                        currentPage = backStack.pop();
                        System.out.println("Back -> " + currentPage);
                    } else {
                        System.out.println("No pages in back history.");
                    }
                }

                case 3 -> {
                    if (!forwardStack.isEmpty()) {
                        backStack.push(currentPage);
                        currentPage = forwardStack.pop();
                        System.out.println("Forward -> " + currentPage);
                    } else {
                        System.out.println("No pages in forward history.");
                    }
                }

                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
