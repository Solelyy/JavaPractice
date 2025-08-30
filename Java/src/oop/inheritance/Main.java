package oop.inheritance;

import java.util.Scanner;

public class Main {
    static Scanner s= new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("First name: ");
        String firstName =s.nextLine();

        System.out.print("Last name: ");
        String lastName =s.nextLine();

        System.out.print("Gender: ");
        String gender= s.nextLine();

        System.out.print("School: ");
        String school= s.nextLine();

        System.out.print("Course: ");
        String course= s.nextLine();

        System.out.print("Age: ");
        int age= s.nextInt();

        System.out.print("Graduation Year: ");
        int graduationYear= s.nextInt();

        Graduate graduate = new Graduate (firstName, lastName, gender, age, school, course, graduationYear);
        graduate.introduceSelf();

    }
}
