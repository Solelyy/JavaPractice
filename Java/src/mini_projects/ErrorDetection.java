package mini_projects;

import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class ErrorDetection {
    /*
    Challenge: Error Detection in Message Transmission
    1. Ask the user to input the length of an array, followed by the secret code.
    2. Store it in an array.
    3. Read the secret code and display it.
    4. Ask user to enter the secret code.
    5. Compare the secret code to the user input copy of it.
    6. Store/create a file to show there the result.
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String [] args) throws IOException {
        //1.
        System.out.println("Enter the secret code. " +
                "First the length, then the digits of the code separated by space: ");

        int length = sc.nextInt();
        if (length > 9) {
            System.out.println("Length must be not more than 9.");
            return;
        }

        //2.
        int [] secretCode = new int[length];

        //3.
        readCode(secretCode);
        System.out.println();

        //4.
        System.out.println("Enter the copy code: ");
        int[] copyCode = new int[length];
        for (int i= 0; i <length; i++) {
            copyCode[i]= sc.nextInt();
        }

        //5.
        compareCodes(secretCode, copyCode);
        sc.close();
    }

    public static void readCode(int [] list){
        for (int i= 0; i < list.length; i++) {
            list[i]= sc.nextInt();
        }
        System.out.println("Secret code received. \n");
        System.out.println("Secret code: ");
        for (int num: list) System.out.print(num);
        System.out.println();
    }

    public static void compareCodes(int [] secretCode, int []copyCode) throws IOException {
        boolean codeOk= true;

        //6.
        String filePath = "/Users/jessagozun/Desktop/JavaPractice/Java/src/mini_projects/output.txt";

        PrintWriter writer = new PrintWriter(new FileWriter(filePath));
        writer.printf("%-12s%-12s%n", "Code Digit", "Copy Digit");

        for (int i= 0; i < secretCode.length; i++){
            writer.printf("%-12s%-12s", secretCode[i], copyCode[i]);

            if (secretCode[i] != copyCode[i]) {
                    writer.print("<--Error");
                    codeOk= false;
            }
            writer.println();
        }

        if (codeOk) {
            writer.println("Message transmitted OK.");
        } else {
            writer.println("Message has errors!");
        }

        writer.close();
        System.out.println("Comparison complete. Check output.txt for results.");
    }
}
