package mini_projects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ToDoList {
    /*
    Challenge:
    1. Use an ArrayList to store tasks
    2. For each task input:
    - If it’s not empty, add it to the list and log INFO.
    - If it’s empty, log WARNING and skip adding.
    3. After all inputs, you can:
    - Print all tasks from the collection (optional).
    - Log "Program finished".
    4. Logging to file.
     */
    private static final Logger logger = Logger.getLogger(ToDoList.class.getName());

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> tasks= new ArrayList<>();

        boolean exitProgram= false;

        try {
            FileHandler fileHandler = new FileHandler("/Users/jessagozun/Desktop/JavaPractice/Java/src/mini_projects/todolist.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            System.out.println("Failed to set up file logging: " + e.getMessage());
            logger.severe("Failed to set up file logging: " + e.getMessage());
        }

        logger.info("Program started.");
        System.out.println("-----Welcome to your To-Do List!-----");

        try {
            do {
                System.out.println();
                System.out.println("1. Add Task\n2. View Tasks\n3. Exit");
                System.out.print("Enter your choice (1-3): ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice){
                    case 1 -> {
                        System.out.print("Task: ");
                        String task= sc.nextLine();
                        if (task.isBlank()) {
                            System.out.println("Task not added. Empty task not allowed.");
                            logger.warning("Empty task, skipped.");
                        } else {
                            tasks.add(task);
                            System.out.println("Successfully added.");
                            logger.info("Added a new task: " + task);
                        }
                    }
                    case 2 -> {
                        System.out.println("Tasks: ");
                        for (Object task : tasks) System.out.println("🍒 " + task);
                        logger.info("Viewed Tasks.");
                    }
                    case 3 -> {
                        exitProgram = true;
                        System.out.println("Program exiting...");
                    }
                }
            } while (!exitProgram);

        } catch (InputMismatchException e) {
            System.out.println("Unacceptable input. Must be a number from 1-3 only.");
            logger.warning("Unacceptable input. Must be a number from 1-3 only.");
        }
        logger.info("Program finished.");
    }
}
