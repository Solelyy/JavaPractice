package collections.queue;

import java.util.Deque;
import java.util.Scanner;
import java.util.ArrayDeque;

public class ArrayDequeDemo {
    /*
    Browser Simulation using ArrayDeque
    Features:
    1. Visit pages
    2. Go Back
    3. Go Forward
    4. Exit
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deque<String> backStack = new ArrayDeque<>();
        Deque<String> forwardStack = new ArrayDeque<>();
        String currentPage = null; // represents the default page

        while (true) {
            System.out.println("\n--- Browser Menu ---");
            System.out.printf("%s%n%s%n%s%n%s%n",
                    "1. Visit a page",
                    "2. Go Back",
                    "3. Go Forward",
                    "4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

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
                    } else if (currentPage != null) {
                        forwardStack.push(currentPage);
                        currentPage = null;
                        System.out.println("Back -> [Home]");
                    } else {
                        System.out.println("No pages in back history.");
                    }
                }
                case 3 -> {
                    if (!forwardStack.isEmpty()) {
                        if (currentPage != null) {
                            backStack.push(currentPage);
                        }
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
