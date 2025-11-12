package methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
    int coeff;
    int exp;
    Node next;

    public Node(int coeff, int exp) {
        this.coeff = coeff;
        this.exp = exp;
        this.next = null;
    }
}

class Polynomial {
    Node head = null;

    // Insert term (sorted descending by exponent)
    public void addTerm(int coeff, int exp) {
        if (coeff == 0) return; // skip zero coefficients

        Node newNode = new Node(coeff, exp);

        if (head == null || exp > head.exp) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && current.exp > exp) {
            prev = current;
            current = current.next;
        }

        // merge if same exponent
        if (current != null && current.exp == exp) {
            current.coeff += coeff;
            return;
        }

        newNode.next = current;
        if (prev != null) prev.next = newNode;
        else head = newNode;
    }

    // Display polynomial nicely
    public void display() {
        if (head == null) {
            System.out.println("Polynomial is empty.");
            return;
        }

        Node current = head;
        boolean first = true;

        while (current != null) {
            int coeff = current.coeff;
            int exp = current.exp;

            if (!first && coeff > 0) System.out.print(" + ");
            if (coeff < 0) System.out.print(" - ");

            int absCoeff = Math.abs(coeff);

            if (exp == 0) System.out.print(absCoeff);
            else if (exp == 1) {
                if (absCoeff != 1) System.out.print(absCoeff + "x");
                else System.out.print("x");
            } else {
                if (absCoeff != 1) System.out.print(absCoeff + "x^" + exp);
                else System.out.print("x^" + exp);
            }

            first = false;
            current = current.next;
        }

        System.out.println();
    }
}

public class PolynomialLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Polynomial poly = new Polynomial();

        System.out.print("Number of terms: ");
        int n = sc.nextInt();

        // store the input terms to print later
        List<String> termsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter coefficient for term " + (i + 1) + ": ");
            int coeff = sc.nextInt();
            System.out.print("Enter exponent for term " + (i + 1) + ": ");
            int exp = sc.nextInt();

            poly.addTerm(coeff, exp);
            termsList.add("(" + coeff + "," + exp + ")");
        }

        // Print the summary of terms
        System.out.println("\nNumber of terms: " + n);
        System.out.println("Terms: " + String.join(", ", termsList));

        // Display final polynomial
        System.out.print("Polynomial: ");
        poly.display();

        sc.close();
    }
}