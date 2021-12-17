package csit105labforch14recursionf20;

/**
 * |Lab 11 for Ch 14 Recursion
 *
 * @author Stephen T. Brower, embed your name in Javadoc below ( ~line 57 )
 */
public class CSIT105LabForCh14RecursionF20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Iteratively: ");
        System.out.println("3 ^ 2 = " + powerIterative(3, 2));
        System.out.println("2 ^ 5 = " + powerIterative(2, 5));

        System.out.println("\nRecursively: ");
        System.out.print("3 ^ 2 = " + power(3, 2));
        if (power(3, 2) == powerIterative(3, 2)) {
            System.out.println(" - good");
        } else {
            System.out.println("\t <=== issue");
        }
        System.out.print("2 ^ 5 = " + power(2, 5));
        if (power(2, 5) == powerIterative(2, 5)) {
            System.out.println(" - good");
        } else {
            System.out.println("\t <=== issue");
        }
    }

    /**
     * This method calculates x^p using an iterative method
     *
     * @param x a positive value to be raised to positive power p
     * @param p positive power
     * @return calculated value of x^p
     */
    public static int powerIterative(int x, int p) {
        int valueToReturn = 1;

        if (p > 0) {
            for (int i = 0; i < p; i++) {
                valueToReturn *= x;
            }
        }

        return valueToReturn;
    }

    /**
     * This method calculates x^p using a recursive method. Think of the
     * recursive case as x^(p) = x * x^(p-1) , and the base case, when p is 0,
     * as x^0 * = 1 .
     *
     * Modified by: Andy Fordjour
     *
     * @param x a positive value to be raised to positive power p
     * @param p positive power
     * @return calculated value of x^p
     */
    public static int power(int x, int p) {
        // change the body of this method
        //logic for for finding the power of the int x
        int result = 0;
        if (p == 0) {
            return 1;
        } else {
            if (p > 0) {
                result = x * power(x, (p - 1));
            }
        }
        return result;
    }
}
