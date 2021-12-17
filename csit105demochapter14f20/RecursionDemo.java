package csit105demochapter14f20;

/**
 * This class demonstrates the Recursive message method.
 *
 * @author Tony Gaddis (et al)
 */

public class RecursionDemo {

    public static void main(String[] args) {
        message(5);
        System.out.println();
    }
    /**
     * message method is a recursive method to demonstrate recursion
     *
     * @param n value to display
     */
    public static void message(int n) {
        System.out.printf("I'm here with n = %d ", n);
        if (n > 0) // base case - will not call itself if n<=0
        {
            System.out.println("...make recursive call using " + (n-1));
            message(n - 1);    // recursive case
        }
        System.out.println("I'm done with: " + n);
    }    
}
