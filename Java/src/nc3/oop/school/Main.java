package nc3.oop.school;

import java.util.Scanner;
//TO DO: Create list of students dynamically

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("Welcome! Enter students first.");
//        System.out.print("How many students?: ");
//        int studentsCount = input.nextInt();
//
//        input.nextLine();
//
//        Student[] students = new Student[studentsCount];
//
//        for (int i = 0; i < students.length; i++) {
//            System.out.print("First name: ");
//            String firstName = input.nextLine();
//
//            System.out.print("Last name: ");
//            String lastName = input.nextLine();
//
//            System.out.print("Course: ");
//            String course = input.nextLine();
//
//            System.out.print("Year [1-4]: ");
//            byte year = input.nextByte();
//
//            input.nextLine();
//
//            System.out.println();
//
//            students[i] = new Student(firstName, lastName, course, year);
//        }
//
//        System.out.println();
//        System.out.println("The students are: ");
//        System.out.printf("%-20s | %-20s | %-10s%n", "Name", "Course", "Year");
//
//        for (Student student: students) {
//            System.out.printf("%-20s | %-20s | %-10s%n",
//                    student.getFullName().toUpperCase(),
//                    student.getCourse().toUpperCase(),
//                    student.getFormattedYear().toUpperCase()
//            );
//        }
//
//        System.out.println("School: " + Student.getSchool());

        Person[] persons = new Person[2];

        persons[0] = new Student("Jessa", "Gozun", "BSIT", (byte) 3);
        persons[1] = new Professor("Taylor", "Swift", "IT", 30_000);

        for (Person person: persons) {
            person.introduceSelf();
        }

        //Downcasting
//        Professor p = (Professor) persons[1];
//        p.introduceSelf();

    }
}
