package collections.map;

import java.util.Scanner;
import java.util.HashMap;

public class HashMapDemo {
    /*
    Challenge:
    1. Ask the user to input a sentence.
    2. Split the sentence into words.
    3. Use a HashMap<String, Integer>:
    Key → word
    Value → frequency (how many times it appeared)
    4. Print all words with their counts.
    5. Let the user search for a specific word and display
    its frequency (or show “not found”).
     */
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        HashMap <String, Integer> wordCount = new HashMap<>();

        //1.
        System.out.print("Input a sentence: ");
        String sentence = sc.nextLine();

        //2.
        String [] words  = sentence.split("\\W+");

        //3.
        System.out.println("Word and its count: ");
        for (String word : words){
            word = word.toLowerCase();
            if (wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word) +1);
            } else {
                wordCount.put(word, 1);
            }
        }

        //4. Map.Entry<String, Integer> entry (long form) shortcut is just var
        for (var entry: wordCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        /* other way:
        wordCount.forEach((word, count) ->
                System.out.println(word + "=" + count)
                );*/

        //5.
        System.out.print("Search a word: ");
        String searchWord= sc.next().toLowerCase();

        if (wordCount.containsKey(searchWord)) {
            System.out.println("Count: " + wordCount.get(searchWord));
        } else {
            System.out.println("Not found.");
        }
    }
}
