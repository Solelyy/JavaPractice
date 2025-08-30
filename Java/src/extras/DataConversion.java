package extras;

import java.util.Scanner;

public class DataConversion {
    public static void main (String [] args) {
        Scanner s= new Scanner(System.in);
        //Data Conversion (Parsing)

        //Example #1
        System.out.println("Parsing \nExample 1: ");
        String age= "10";
        int convertAge= Integer.parseInt(age);
        System.out.println("Age in String: "+ age+1);
        System.out.println("Age Converted in Int: "+ (convertAge+1));
        System.out.println();

        System.out.println("Example 2:");
        System.out.print("Enter grade: ");
        // To avoid error for nextLine, convert nextLine to float.
        float grade= Float.parseFloat(s.nextLine());

        System.out.print("Enter name: ");
        String name= s.nextLine();
        System.out.printf("My name is %s. My grade is %.2f%n", name, grade);
        System.out.println();

        //String.valueOf() - numeric to String
        System.out.println("Numeric to String:");
        byte b= 5;
        String x= String.valueOf(b);

        System.out.println("Number: " + (b+1));
        System.out.println("Number converted to String: "+ x+1);
        System.out.println();
    }
}
