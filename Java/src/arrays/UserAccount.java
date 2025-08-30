package arrays;

import java.util.Scanner;

public class UserAccount {
    public static void main (String [] args) {
        // email, username, password. 5 users.
        Scanner scanner= new Scanner(System.in);
        int index;

        String userName[] = {"Anna", "Bene", "Cathy", "Dina", "Elle"};
        String email[] = {
                "anna@gmail.com",
                "bene@gmail.com",
                "cathy@gmail.com",
                "dina@gmail.com",
                "elle@gmail.com"};
        String password [] = {
                "anna123",
                "bene123",
                "cathy123",
                "dina123",
                "elle123",
        };

        System.out.print("Enter index number 0-4: ");
        index=scanner.nextInt();
        if (index==0) {
            System.out.println("Username: " + userName[0]);
            System.out.println("Email: " + email[0]);
            System.out.println("Password: " + password[0]);
        }
        if (index==1) {
            System.out.println("Username: " + userName[1]);
            System.out.println("Email: " + email[1]);
            System.out.println("Password: " + password[1]);
        }
        if (index==2) {
            System.out.println("Username: " + userName[2]);
            System.out.println("Email: " + email[2]);
            System.out.println("Password: " + password[2]);
        }
        if (index==3) {
            System.out.println("Username: " + userName[3]);
            System.out.println("Email: " + email[3]);
            System.out.println("Password: " + password[3]);
        }
        if (index==4) {
            System.out.println("Username: " + userName[4]);
            System.out.println("Email: " + email[4]);
            System.out.println("Password: " + password[4]);
        }
    }
}
