package extras;

import java.util.Scanner;
public class GenericsDemo {
    /*
    Challenge:
    Create a generic class Pair that stores two values of any type,
    and a method to print them. Then try it with:
    Two integers / Two strings / An integer and a string
     */
    static class Pair <T,U> {
        private T first;
        private U second;

        public Pair (T first, U second) {
            this.first = first;
            this.second = second;
        }

        public void print () {
            System.out.println(first +", "+ second);
        }
    }
    public static void main (String [] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter two numbers.");
        System.out.print("First number: ");
        int firstNum= sc.nextInt();
        System.out.print("Second number: ");
        int secondNum= sc.nextInt();

        Pair <Integer, Integer> numbers= new Pair<>(firstNum, secondNum);
        System.out.print("Numbers: ");
        numbers.print();
    }
}
