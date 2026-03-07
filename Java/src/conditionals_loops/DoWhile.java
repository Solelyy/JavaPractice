package conditionals_loops;
import java.util.Calendar;
import java.util.Scanner;

// Challenge:
// 1. Ask the user to enter a PIN.
// 2. The correct PIN is: 1234
// 3. Keep asking until the user enters the correct PIN.
// 4. After 3 wrong attempts, print: Card Blocked.
// 5. If correct before 3 attempts: Access Granted.

public class DoWhile {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String correctPin = "1234";
        String userPin;
        int attempt = 0;

        do {
            attempt++;
            System.out.print("Enter PIN: ");
            userPin= sc.next();

            if (userPin.equals(correctPin)) {
                System.out.println("Access Granted!");
                break;
            }
        } while (attempt < 3);

        if (!userPin.equals((correctPin))) {
            System.out.println("Card Blocked.");
        }
    }
}
