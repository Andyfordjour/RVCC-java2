package csit105demochapter10f20;

/**
 * NegativeInterestRate exceptions are thrown by the BankAccount class when a
 * negative interest rate is passed to the constructor.
 *
 * @author Tony Gaddis (et al)
 */

public class NegativeInterestRate extends Exception {

    /**
     * No-arg constructor
     */

    public NegativeInterestRate() {
        super("Error: Negative interest rate");
    }

    /**
     * The following constructor accepts the amount that was given as the
     * interest rate.
     */
    public NegativeInterestRate(double amount) {
        super("Error: Negative interest rate: " + amount);
    }
}
