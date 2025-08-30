package methods;

public class MethodDemo {
    public static void main(String [] args ){
        double result = summation(new double[] {12,13,14});
        System.out.print(result);
    }

    static double summation(double numbers[]){
        double sum = 0;
        for (double number: numbers){
            sum+=number;
        }
        return sum;
    }
}
