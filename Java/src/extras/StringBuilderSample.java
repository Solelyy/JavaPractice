package extras;

public class StringBuilderSample {
    public static void main (String[] args) {
//        //Problem: The String is immutable, so it creates another object,
//        // and the old one is candidate for garbage collector
//        String text = "Hello";
//        System.out.println("Before: " + text);
//
//        text = text + " World";
//
//        System.out.println("After: " + text);
//
//        /*Problem:
//        Each loop:
//        - creates NEW String object
//        - copies old contents
//        - wastes memory
//        - slower performance
//         */
//
//        String sample = "";
//        for (int i = 0; i< 5; i++) {
//            sample += i;
//            System.out.println(sample);
//        }
//
//        //Try StringBuilder - it modifies the same object
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 5 ; i++) {
//            sb.append(i);
//            System.out.println(sb);
//        }
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 100_000; i++) {
            sb.append(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time: " + (end - start) + "ms");
    }
}
