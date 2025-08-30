package extras;

public class MathClasses {
    /*
    Create a Java program that:
    1. Generates 5 random numbers between 1 and 100 using Math.random().
    2. Prints each number.
    3. Finds and prints the maximum and minimum using Math.max and Math.min.
    4. Prints the average (use Math.round to round it to 2 decimal places).
    */

    public static void main(String[] args) {
        System.out.print("Numbers: ");
        int numbers[] = new int[5];
        for (int i= 0; i < numbers.length; i++){
            numbers[i]= (int)(Math.random() * 100) +1;
            System.out.print(numbers[i] + " ");
        }

        int maxNumber= numbers[0];
        int minNumber= numbers[0];
        double sum = 0;

        for (int i = 0; i< numbers.length; i++) {
            maxNumber = Math.max(numbers[i], maxNumber);
            minNumber = Math.min(numbers[i], minNumber);
            sum +=numbers[i];
        }
        System.out.println();
        System.out.printf("Largest number: %d%n", maxNumber);
        System.out.printf("Smallest number: %d%n", minNumber);

        double average= sum / numbers.length;
        double roundedAve= Math.round(average * 100.0)/100.0;
        System.out.printf("Average: %.2f", roundedAve);
    }
}
