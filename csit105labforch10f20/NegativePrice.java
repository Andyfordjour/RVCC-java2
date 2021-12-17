package csit105labforch10f20;

/**
 *
 * @author Andy Fordjour
 */
public class NegativePrice extends Exception {

    /**
     * No-arg constructor
     */
    public NegativePrice() {
        super("Error: Negative price ");
    }

    /**
     * Constructor initialize NegativePrice field with the values passed to
     * price
     *
     * @param price value for the item NegativePrice
     */
    public NegativePrice(double price) {
        super("Error: Negative price : " + price);
    }
}
// hint, see NegativeStartingBalance.java or NegativeInterestRate.java in Ch 10 Demos
