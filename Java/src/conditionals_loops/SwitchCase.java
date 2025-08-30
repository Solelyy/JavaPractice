package conditionals_loops;

import java.util.Scanner;

public class SwitchCase {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int month, date, year;

        System.out.print("Enter a month number 1-12: ");
        month=scanner.nextInt();

        if (month < 1 || month > 12 ) {
            System.out.println("Invalid month.");
            return;
        }

        System.out.print("Enter a date: ");
        date=scanner.nextInt();

        System.out.print("Enter a year: ");
        year=scanner.nextInt();

        String monthWord="";
        int maxDays= 0;

        boolean isLeapYear= year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        switch (month){
            case 1:
                monthWord= "January";
                maxDays= 31;
                break;
            case 2:
                monthWord= "February";
                maxDays= (isLeapYear) ? 29 : 28;
                break;
            case 3:
                monthWord= "March";
                maxDays= 31;
                break;
            case 4:
                monthWord= "April";
                maxDays= 30;
                break;
            case 5:
                monthWord="May";
                maxDays= 31;
                break;
            case 6:
                monthWord="June";
                maxDays= 30;
                break;
            case 7:
                monthWord="July";
                maxDays= 31;
                break;
            case 8:
                monthWord="August";
                maxDays= 31;
                break;
            case 9:
                monthWord="September";
                maxDays= 30;
                break;
            case 10:
                monthWord="October";
                maxDays= 31;
                break;
            case 11:
                monthWord="November";
                maxDays= 30;
                break;
            case 12:
                monthWord="December";
                maxDays= 31;
                break;
        }
        if (date < 1 || date > maxDays) {
            System.out.println("Invalid date. " + monthWord + " has only " + maxDays
                    + " days.");
            return;
        }
        System.out.println (monthWord + " " +  date + ", " + year );
    }
}