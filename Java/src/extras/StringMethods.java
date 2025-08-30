package extras;

public class StringMethods {
    public static void main(String [] args){
        String [] words = {"Creek", "Creepy", "Intern", "Lantern"};
        for (String w: words) {
            if (w.startsWith("Cree"))
                System.out.println(w + " starts with 'cree'");
        }
        System.out.println();

        for (String w: words){
            if (w.endsWith("ern")) System.out.println(w + " ends with 'ern'");
        }
    }
}