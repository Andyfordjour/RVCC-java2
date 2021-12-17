package csit105demochapter14f20;

import java.util.Scanner;

/**
 * This program shows a recursive solution to factorial
 *
 * @author Stephen Brower
 */
public class FactorialRecursiveSolution {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter n (slides use 4): ");
        n = input.nextInt();

        System.out.printf("\n%,d! = %,d\n", n, factorial(n));

    }

    /**
     * factorial method determines the factorial of n
     *
     * @param n value to use for factorial
     * @return n!
     */
    public static int factorial(int n) {
        int valToReturn;

        if (n == 0) {
            valToReturn = 1;                   // base case
        } else {
            valToReturn = n * factorial(n - 1);  // recursive case
        }
        return valToReturn;
    }
}
