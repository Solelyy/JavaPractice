package oop.abstraction;

import java.util.Scanner;

public class Main {
    public static void main (String [] args ){
        Scanner scanner = new Scanner(System.in);
        double monthlyRate= 0;
        double hourlyRate= 0;
        int hoursWorked= 0;

        System.out.print("Employee Name: ");
        String name= scanner.nextLine();

        System.out.print("Employee ID: ");
        int employeeId= scanner.nextInt();
        scanner.nextLine();

        Employee employee;
        System.out.print("Are you a Full-time Employee? [Yes/No]: ");
        String answer=scanner.nextLine();

        if (answer.equalsIgnoreCase("Yes")) {
            System.out.print("Monthly Rate?: ");
            monthlyRate= scanner.nextDouble();
            employee= new FullTime(name, employeeId, monthlyRate);
        } else {
            System.out.print("Hourly Rate (peso): ");
            hourlyRate= scanner.nextDouble();
            System.out.print("Hours Worked: ");
            hoursWorked= scanner.nextInt();
            employee = new PartTime(name, employeeId, hourlyRate, hoursWorked);
        }
        System.out.println();
        employee.showInfo();
    }
}
