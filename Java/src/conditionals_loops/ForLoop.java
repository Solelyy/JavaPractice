package conditionals_loops;

import java.util.Scanner;

public class ForLoop {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;

        String userNames [] = {"AnnaWarrior", "PedroPenduko", "ElleMalakas"};
        String passwords [] = {"anna123", "pedro123", "elle123"};

        boolean isMatch= false;

        while (!isMatch) {
            System.out.print("Username: \t");
            username= scanner.nextLine();
            System.out.print("Password: \t");
            password=scanner.nextLine();

            for (int i = 0; i < userNames.length; i++) {
                if (username.equals(userNames[i]) && password.equals(passwords[i])) {
                    System.out.println("Welcome, " + userNames[i] + "!");
                    isMatch = true;
                    break;
                }
            }
            if (!isMatch) System.out.println("Incorrect username or password. Try again.");
        }
        System.out.println();
    }
}

