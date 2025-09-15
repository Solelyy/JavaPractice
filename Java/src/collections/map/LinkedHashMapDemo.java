package collections.map;

import java.util.Scanner;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    /*
    1. Ask the user to input words one by one.
    2. Store each word in a LinkedHashMap<String, Integer>.
    Key → word
    Value → how many times it appeared so far
    Since LinkedHashMap keeps the insertion order, the first word entered will appear first when printing.
    3. After all inputs, display all words in the order they were entered, along with their counts.
    Bonus: Let the user enter another word to “check its frequency.”
     */
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap <String, Integer> wordCount = new LinkedHashMap<>();

        while (true) {
            System.out.print("Enter a word: ");
            String word = sc.next().toLowerCase();

            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) +1);
            } else {
                wordCount.put(word, 1);
            }

            System.out.print("Enter another word? (y/n): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("y")) break;
            System.out.println();
        }

        System.out.println();
        System.out.println("Words and it's count: ");
        for (var entry: wordCount.entrySet()) {
            System.out.println(entry.getKey()  + " = " + entry.getValue());
        }
        
        System.out.println();
        System.out.print("Search word: ");
        String searchWord = sc.next().toLowerCase();

        if (wordCount.containsKey(searchWord)) {
            System.out.println("Frequency count: " + wordCount.get(searchWord));
        } else {
            System.out.println("Not found!");
        }
    }
}
