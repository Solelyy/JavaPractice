package collections.list;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    /*
    Uses a Stack<Character> to check if a string has balanced parentheses.Example:
        Input: "((a+b)*c)" → Output: Balanced
        Input: "((a+b)" → Output: Not Balanced
     */
    public static void main (String [] args ) {
        Scanner sc= new Scanner(System.in);
        Stack <Character> characters= new Stack <>();

        System.out.print("Enter an expression: ");
        String expression = sc.nextLine();

        for (int i= 0; i < expression.length(); i++){
            char ch = expression.charAt(i);

            if (ch == '(') {
                characters.push(ch);
            }
            else if (ch == ')') {
                if (characters.isEmpty()) {
                    characters.push(ch);
                    break;
                }
                else characters.pop();
            }
        }
        if (characters.isEmpty()) {
            System.out.println("Result: Balanced!");
        }
        else System.out.println("Result: Not Balanced!");
    }
}
