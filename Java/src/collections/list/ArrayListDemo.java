package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    /*
    Challenge:
    1. Add 5 numbers.
    2. Replace the 3rd number with a new value.
    3. Remove the smallest number.
    4. Print the list and its size.
     */
    public static void main (String args []){
        //1.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        //2.
        numbers.set(2, 33);

        System.out.print("Numbers: ");
        for (int num: numbers) System.out.printf("%d ", num);
        System.out.println();
        
        //3.
        int minNum = Collections.min(numbers);

        System.out.println("Smallest number: " + minNum);
        System.out.println("\nRemoving the smallest number...");
        numbers.remove(Integer.valueOf(minNum));

        //4.
        System.out.print("Updated list: ");
        for (int num: numbers) System.out.printf("%d ", num);

        System.out.println();
        System.out.println("Size: " + numbers.size());
    }
}
