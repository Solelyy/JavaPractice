package extras;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxing {
    public static void main (String [] args){
        List<Integer> scores= new ArrayList<>();
        scores.add(10); //Autoboxing -> int to Integer
        scores.add(12);
        scores.add(34);
        scores.add(454);
        scores.add(34);

        int sum= 0;

        for (int i= 0; i < scores.size(); i++){
            sum += scores.get(i); //Unboxing -> Integer to int
            if (i == scores.size()-1)
                System.out.print(scores.get(i) + " = ");
            else System.out.print(scores.get(i) + " + ");
        }
        double ave= (double) sum / scores.size();
        System.out.println(sum);
        System.out.print("The average is " + ave);
    }
}