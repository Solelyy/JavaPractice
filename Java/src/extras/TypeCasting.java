package extras;

public class TypeCasting {
    public static void main (String [] args){
        //Type Casting - data type to another data type
        //Widening Type Casting= Smaller to Bigger data type
        //byte - short - int - long - float (approx. 7 decimals) - double (approx. 15 decimals)
        System.out.println("Type Casting");
        System.out.println("1. Widening Type Casting/ Implicit:");
        byte by= 45; //byte is up to 127
        int in= by;
        System.out.println(by);
        System.out.println();

        System.out.println("1. Narrowing Type Casting/ Explicit:");
        double d= 12315.5060577979797;
        long l= (long) d;
        System.out.println("Float: " + d);
        System.out.println("Convert to Long: " + l);
    }
}
