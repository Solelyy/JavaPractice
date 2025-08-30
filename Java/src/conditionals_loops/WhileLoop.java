package conditionals_loops;

public class WhileLoop {
    public static void main (String [] args){
        String fruits [] = {"Mango", "Apple", "Grapes", "Pineapple", "Papaya" };
        int i= 0;
        boolean found= false;

        while (i < fruits.length){
            if (fruits[i].equals("Apple")) {
                System.out.println("We found " + fruits[i] + " at index " + i + "!");
                //System.out.printf("%s %s %s %d%c", "We found", fruits[i], "at index", i, '!');
                found=true;
                break;
            }
            i++;
        }
        if (!found) {
            System.out.println("We didn't found it.");
        }
    }
}

