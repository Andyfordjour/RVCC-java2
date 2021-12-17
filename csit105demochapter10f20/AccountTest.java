package csit105demochapter10f20;

/**
 * This program demonstrates how the BankAccount class constructor throws custom
 * exceptions.
 *
 * @author Tony Gaddis (et al)
 */

public class AccountTest {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // Force a NegativeStartingBalance exception.
        try {
            BankAccount account = new BankAccount(-1, 0.04);
            System.out.println(account); //added on fly in class
        } catch (NegativeStartingBalance e) {
            System.out.println(e.getMessage());
        } catch (NegativeInterestRate e) {
            System.out.println(e.getMessage());
        }

        // Force a NegativeInterestRate exception.
        try {
            BankAccount account = new BankAccount(100, -0.04);
            System.out.println(account); //added on fly in class
        } catch (NegativeStartingBalance e) {
            System.out.println(e.getMessage());
        } catch (NegativeInterestRate e) {
            System.out.println(e.getMessage());
        }
    }
}
