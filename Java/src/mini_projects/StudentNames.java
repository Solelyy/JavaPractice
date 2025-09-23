package mini_projects;

import java.io.*;
import java.util.Scanner;
public class StudentNames {
    /*
    Challenge:
    1. Ask the user to input student names (one by one).
    2. Save those names into a file.
    3. Each name should be written on a new line.
    4. After saving, read the file back and display:
    -All names
    -The total number of students
     */

    public static void main (String [] args) {
        Scanner sc= new Scanner(System.in);

        String filePath= "/Users/jessagozun/Desktop/JavaPractice/Java/src/mini_projects/StudentNames.txt";

        System.out.print("How many students would you like to enter?: ");
        int count = sc.nextInt();
        sc.nextLine();

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(filePath));
            writer.println("Students:");

            for (int i= 0; i < count; i++) {
                System.out.printf("Student %d: ", i+1);
                String studentName= sc.nextLine();
                writer.printf("%d. %-20s\n",i+1, studentName);
            }
            writer.close();

            System.out.println("Saved to StudentNames.txt!");

            System.out.println();
            System.out.println("------Reading back from file-------");
            BufferedReader reader= new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            System.out.println("Total students: " + count);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
