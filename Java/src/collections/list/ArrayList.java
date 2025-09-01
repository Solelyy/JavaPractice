package collections.list;

import java.util.List;

public class ArrayList {
    /*
    1. Add 5 numbers.
    2. Replace the 3rd number with a new value.
    3. Remove the smallest number.
    4. Print the list and its size.
     */
    public static void main (String args []){
        List<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.set(1, 23);

        int minNum = numbers.get(0);
        for (int i= 0; i < numbers.size(); i++){
            minNum= Math.min(minNum, numbers.get(i));

        }

        System.out.print("Numbers: ");
        for (int num: numbers) System.out.printf("%d ", num);
        System.out.println();

        System.out.println("Smallest number: " + minNum);

        System.out.println("\nRemoving the smallest number...");

        numbers.remove(Integer.valueOf(minNum));
        System.out.print("Updated list: ");
        for (int num: numbers) System.out.printf("%d ", num);

        System.out.println();
        System.out.println("Size: " + numbers.size());
    }
}
