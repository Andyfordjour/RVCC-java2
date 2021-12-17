package csit105demochapter14f20;

/**
 * This program demonstrates the recursive fib method.
 *
 * @author Tony Gaddis (et al)
 */

public class FibNumbers {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The first 14 numbers in the "
                + "Fibonacci series are:");

        for (int i = 0; i < 14; i++) {
            System.out.print("fib("+i+") = ");
            System.out.println(fib(i) + " ");
        }

        System.out.println();
    }

    /**
     * The fib method returns the nth Fibonacci number.
     *
     * @param n the value for the nth Fibonacci number requested
     * @return value for the nth Fibonacci number requested
     */
    public static int fib(int n) {
        int valueToReturn;
        System.out.print(".");  //  <== added to demonstrated the # of calls
        if (n == 0) // base case
        {
            valueToReturn = 0;
        } else if (n == 1) // base case
        {
            valueToReturn = 1;
        } else // recursive case
        {
            valueToReturn = fib(n - 1) + fib(n - 2);
        }

        return valueToReturn;
    }
}
