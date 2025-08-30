package conditionals_loops;

public class NestedForLoop {
    public static void main (String [] args){
        //Scoreboard for 3 students. and calculate their average

        String students []= {"Anna", "Belle", "Cathy"};
        int scores [][] = {
                {12, 20, 30, 40},
                {20, 20, 30, 12},
                {15, 24, 12, 27}
        };

        for (int i= 0; i < students.length; i++ ){
            int sum= 0;
            System.out.print(students[i]+ "'s scores: ");

            for (int x= 0; x < scores[i].length; x++) {
                System.out.print(scores[i][x] + " ");
                sum+=scores[i][x];
            }
            double average= (double) sum / scores[i].length;
            System.out.printf("Average: %.2f%n", average);
        }
    }
}
