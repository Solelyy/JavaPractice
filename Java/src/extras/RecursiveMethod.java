package extras;

import java.util.ArrayList;

public class RecursiveMethod {
    public static void main (String [] args){
        //Create arraylist of integers
        //Put values in it manually
        //Pass arraylist in the recursive method that output summation of numbers
        ArrayList <Integer> numbers= new ArrayList<>();
        numbers.add(2);
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        summation(numbers, 0, 0);
    }

    static void summation (ArrayList<Integer> num, int i, int prev) {
        if (i == num.size()) {
            return;
        }
        int sum= prev + num.get(i);
        System.out.println(prev + " + " + num.get(i) + " = " + sum );

        prev+= num.get(i);
        summation(num,++i,prev);
    }
}