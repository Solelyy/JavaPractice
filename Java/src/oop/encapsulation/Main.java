package oop.encapsulation;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Welcome! How many students you will register?: ");
        int studentLength= scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        Student students [] = new Student[studentLength];

        for (int i= 0; i < students.length; i++) {
            int count= i + 1;
            System.out.println("Student " + count + ": ");

            System.out.print("First name: ");
            String firstName= scanner.nextLine();

            System.out.print("Last name: ");
            String lastName= scanner.nextLine();

            System.out.print("Course: ");
            String course= scanner.nextLine();

            System.out.print("Section: ");
            String section= scanner.nextLine();

            System.out.print("Year: ");
            int year= scanner.nextInt();
            scanner.nextLine();

            Student student = new Student(firstName, lastName, course, section, year);

            students [i] = student;
            System.out.println();

        }
        for (Student student: students){
            student.displayInfo();
        }
    }
}
