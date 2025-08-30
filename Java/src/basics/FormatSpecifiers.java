package basics;

public class FormatSpecifiers {
    public static void main (String [] args){
        String students []= {"Anna", "Belle", "Cathy", "Aurora"};
        String subjects []= {"Math", "Science", "English", "Arts"};
        int grades [][] = {
                {92, 98, 93, 87},
                {75, 65, 76, 77},
                {82, 88, 93, 87},
                {92, 98, 73, 77}
        };
        System.out.printf("%-10s ", "Student");
        for (String subject : subjects) System.out.printf("%-10s ", subject);
        System.out.printf("%-13s %-13s %n", "Average", "Remarks");
        System.out.println("-----------------------------------------------------" +
                "------------------------");
        /*  flags:
            %b - boolean
            %c - char
            %d - int
            %f - float and double]
            %s - String

            %[flags][precision][width][conversion character]

            ex: %.2f (.2 is the precision of how many decimals are shown)
                +f (output has + in the beginning, ex. +10000 or -10000 if it its negative value)
                - (left-align)
                0 (add zero in the beginning, ex. %0f -> 00001000.00000)
                , (add a coma, ex. %,.2f -> 1,000.00)
        */

        for (int i= 0; i < students.length; i++) {
            int sum=0;
            System.out.printf("%-10s ", students[i]);

            for (int x = 0; x < grades[i].length; x++) {
                sum += grades[i][x];
                System.out.printf("%-10d ", grades[i][x]);
            }
            double average = (double) sum / grades[i].length;
            String remarks = (average > 75) ? "Passed" : "Failed";
            System.out.printf("%-13.2f %-13s ", average, remarks);
            System.out.println();
        }
    }
}