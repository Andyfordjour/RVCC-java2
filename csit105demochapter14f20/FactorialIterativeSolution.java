package csit105demochapter14f20;

import java.util.Scanner;

/**
 * This program shows an iterative solution to factorial
 *
 * @author Stephen Brower
 */
public class FactorialIterativeSolution {

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
        int result = 1;
        for (int i = n; i > 0; i--) {
            result = result * i;
        }
        return result;
    }
}
