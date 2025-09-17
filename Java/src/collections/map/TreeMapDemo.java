package collections.map;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapDemo {
    /*
    Challenge:
    1. Ask the user to input a sentence.
    2. Split it into words.
    3. Store each word and its frequency in a TreeMap<String, Integer>.
        Key → word (String)
        Value → frequency (how many times the word appears)
    4. Print all words in alphabetical order automatically (thanks to TreeMap).
    Bonus: Print them in reverse alphabetical order using descendingMap().
     */
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        TreeMap <String, Integer> wordCount = new TreeMap<>();

        //1.
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        //2.
        String [] words = sentence.split("\\W+");

        //3.
        for (String word : words) {
            word = word.toLowerCase();
            if (wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word) +1);
            } else {
                wordCount.put(word, 1);
            }
        }

        //4.
        System.out.println("\nWord with its frequency count in the sentence: ");
        for (var entry: wordCount.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        //Bonus
        System.out.println("\nWord with its frequency (descending order): ");
        for (var entry: wordCount.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
