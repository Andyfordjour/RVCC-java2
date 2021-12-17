package csit105labforch10f20;

/**
 *
 * @author Andy Fordjour
 */
public class NegativeUnitsOnHand extends Exception {

    /**
     * No-arg constructor
     */
    public NegativeUnitsOnHand() {
        super("Error: Negative units on hand ");
    }

    /**
     * Constructor initialize NegativeUnitsOnHand field with the values passed
     * to unit
     *
     * @param unit value for the item UnitsOnHand
     */
    public NegativeUnitsOnHand(int unit) {
        super("Error: Negative units on hand : " + unit);
    }
}
// hint, see NegativeStartingBalance.java or NegativeInterestRate.java in Ch 10 Demos
