package nc3.basics;

import java.util.Scanner;

public class UserIntroduction {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name?: ");
        String name = input.nextLine();

        System.out.print("How old are you?: ");
        byte age = input.nextByte();

        input.nextLine();

        System.out.print("What is your favorite hobby?: ");
        String hobby = input.nextLine();

        System.out.println("Nice to meet you, " + name + "!");
        System.out.println("You are " + age + " years old, and you love " + hobby + ".");
    }
}
