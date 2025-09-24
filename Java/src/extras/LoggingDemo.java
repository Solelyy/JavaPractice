package extras;

import java.util.Scanner;
import java.util.logging.Logger;

public class LoggingDemo {
    /*
    Challenge:
    Create a program that simulates a simple login system.
    It should:
    - Ask the user for a username and password.
    - If correct (let’s say: admin / 1234), log INFO: Login successful.
    - If wrong, log WARNING: Invalid login attempt.
    - Regardless of success or failure, log INFO: Program finished.
    - Use a Logger instead of System.out.println.
     */
    private static final Logger logger = Logger.getLogger(LoggingDemo.class.getName());

    public static void main (String [] args) {
        logger.info("Login attempt started.");

        Scanner sc= new Scanner(System.in);
        String correctUsername = "ilovejava";
        String correctPassword = "java123";

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            logger.info("Log in successful.");
        } else {
            logger.warning("Invalid log in attempt.");
        }
        logger.info("Program finished.");
    }
}
