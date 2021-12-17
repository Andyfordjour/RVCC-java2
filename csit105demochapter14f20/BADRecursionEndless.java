package csit105demochapter14f20;
/**
 * @author Tony Gaddis (et al)
 * This class has a BAD recursive method because there is no base case.
 */

public class BADRecursionEndless
{
    /**
     * The main method is the program's starting point.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        message();
    }

    /**
     * BAD BAD BAD
     * endless recursion - no base base
     * BAD BAD BAD
     */
    public static void message()
    {
        System.out.println("This is a BAD recursive method.");
        message();  // BAD BAD BAD
    }
}
