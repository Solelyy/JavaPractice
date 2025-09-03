package extras;

import java.util.ArrayList;
import java.util.Scanner;

public class Stream {
    /*
    Create a program that:
    1. Has a list of artists names.
    2. Asks the user to enter a name to search.
    Do it two ways:
    -Using a normal loop (for)
    -Using .stream().anyMatch(...)
    3. Print whether the artist exists or not.
     */
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        //1.
        ArrayList<String> artists = new ArrayList<>();
        artists.add("Taylor");
        artists.add("Sabrina");
        artists.add("Ariana");
        artists.add("Olivia");
        artists.add("Chappell");

        //2.
        System.out.print("Enter artist name: ");
        String userInput= sc.next();

        /*3. Using foreach loop (enhanced for loop)
        boolean isFound= false;
        for (String artist: artists) {
            if (artist.equalsIgnoreCase(userInput)){
                isFound=true;
                System.out.print("Artist found!");
                break;
            }
        }
        if (!isFound) System.out.println("Artist not found!");
        */

        //3. Using stream
        boolean found = artists.stream().
                anyMatch(artist -> artist.equalsIgnoreCase(userInput));

        System.out.println(found ? "Artist found!" : "Artist not found!");
    }
}
