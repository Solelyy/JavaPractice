package mini_projects;
import java.util.Scanner;

// Create a banking console app
/*
1. Enter PIN (max of 3 attempts)
2. Menu: Check Balance, Deposit, Withdraw, Transfer Money, Exit
3. Check Balance: Display balance
4. Deposit: Ask to enter amount, then add to current balance.
5. Withdraw: Ask amount, and it should be <= to balance
6. Transfer Money: Ask for the recipient and amount <= balance + transfer fee.
*/

public class BankSystem {
    static Scanner scanner = new Scanner(System.in);
    static double balance = 0;

    public static void main (String [] args) {
        if (login()) {
            showMenu();
        } else {
            System.out.println("Exiting system...");
        }
    }

    //login
    private static boolean login() {
        String correctPIN = "1234";
        int MAX_ATTEMPT = 3;
        int attempt = 0;
        String userPIN;
        do {
            attempt++;
            System.out.print("Enter PIN: ");
            userPIN = scanner.next();

            if (userPIN.equals(correctPIN)) {
                System.out.println("Welcome!");
                return true;
            } else {
                System.out.println("Incorrect PIN, try again.");
            }
        } while (attempt < MAX_ATTEMPT);

        System.out.println("Maximum failed attempts reached. Account locked temporarily.");

        return false;
    }

    //menu
    private static void showMenu() {
        int choice;
        System.out.println("==== BANK MENU ==== \n" +
                "1. Check Balance \n" +
                "2. Deposit \n" +
                "3. Withdraw \n" +
                "4. Transfer Money \n" +
                "5. Exit");
        do {
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> checkBalance();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> transferMoney();
                case 5 -> System.out.println("Exiting...");
            }
        } while (choice != 5);
    }

    //check balance
    private static void checkBalance() {
        System.out.printf("%-10s%.2f%n", "Balance: Php",balance);
        return;
    };

    //deposit
    private static void deposit() {
        System.out.print("Deposit amount: ");
        double depositAmount = scanner.nextDouble();

        balance += depositAmount;

        System.out.printf("%-2s %.2f %-10s%n", "Php",depositAmount,"successfully deposited.");
    }

    //withdraw
    private static void withdraw() {
        double withdrawAmount;
        do {
            System.out.print("Withdraw amount: ");
            withdrawAmount = scanner.nextDouble();

            scanner.nextLine();

            if (withdrawAmount > balance) System.out.println("Insufficient balance.");
            else {
                System.out.printf("%-10s%n", "Withdrawal successful!");
                balance -= withdrawAmount;
            }
        } while (withdrawAmount > balance);
    }

    //transfer money
    private static void transferMoney(){
        System.out.print("Account number: ");
        String accountNo = scanner.next();

        System.out.print("Amount to be transferred: ");
        double transferMoneyAmount = scanner.nextDouble();

        if (transferMoneyAmount > balance - 15) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.printf("%-4s %.2f %-10s%n", "Php", transferMoneyAmount, "transferred successfully.");
            balance -= transferMoneyAmount;
        }
    }
}
