package mini_projects;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class ToDoList {
    /*
    Challenge:
    1. Use an ArrayList to store tasks
    2. For each task input:
    - If it’s not empty, add it to the list and log INFO.
    - If it’s empty, log WARNING and skip adding.
    3. After all inputs, you can:
    - Print all tasks from the collection (optional).
    - Log "All tasks entered, program finished".
    4. Logging to file (optional).
     */
    private static final Logger logger = Logger.getLogger(ToDoList.class.getName());

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> tasks= new ArrayList<>();

        boolean exitProgram= false;

        logger.info("Program started.");
        System.out.println("Welcome to your To-Do List!");
        do {
            System.out.println("1. Add Task\n2. View Tasks\n3. Exit");
            System.out.print("Enter your choice (1-3): ");
            int choice = sc.nextInt();

            switch (choice){
                case 1 -> System.out.println();
                case 2 -> System.out.println();
                case 3 -> System.out.println();
            }
        } while (!false);
    }
}
