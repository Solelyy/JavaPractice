package conditionals_loops;

public class ForEach {
    public static void main (String [] args) {
        int numbers [] = {10, 20, 30, 40, 50};
        int sum= 0;
        System.out.println("Lets add all of the numbers! ");

        for (int number : numbers) {
            int previous = sum;
            sum += number;
            System.out.println(previous + " + " + number + " = " + sum);
        }
        System.out.println();
        System.out.println("The total is " + sum);
    }
}
