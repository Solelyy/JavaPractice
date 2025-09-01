package extras;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Varargs {
    /*
        Write a method that takes any number of Strings and combines
        them into one sentence separated by spaces.
    */
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        List<String> words= new ArrayList<>();

        System.out.println("Enter words (press Enter with no input to finish):\t");

        while (true) {
            String userInput = sc.nextLine().trim();
            if (userInput.isEmpty()) break;
            words.add(userInput);
        }
        String result = joinStrings(words.toArray(new String[0]));
        System.out.println("Result: " + result);
    }

    static String joinStrings(String ...words){
        return String.join(" ",words);
    }
}
