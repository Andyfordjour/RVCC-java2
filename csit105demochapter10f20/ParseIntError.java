package csit105demochapter10f20;

/**
 * This program demonstrates how the Integer.parseInt method throws an
 * exception.
 *
 * @author Tony Gaddis (et al)
 */

public class ParseIntError {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "eight";
        int number;

        try {
            // Try to convert str to an int.
            number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Conversion error: "
                    + e.getMessage());
        }
    }
}
