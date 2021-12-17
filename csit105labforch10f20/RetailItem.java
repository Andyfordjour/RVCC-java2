package csit105labforch10f20;

/**
 * RetailItem for Ch 10 Exceptions
 *
 * @author Stephen T. Brower, modified by Andy Fordjour
 */
public class RetailItem {

    private String description;
    private int unitsOnHand;
    private double price;

    /**
     * Constructor initialize the description and unitsOnHand and price field
     * with the values passed to initialDescription and initialUnitsOnHand and
     * intitialPrice
     *
     * @param initialDescription value for item description
     * @param initialUnitsOnHand value for the item UnitsOnHand
     * @param initialPrice value for the item Price
     */
    public RetailItem(String initialDescription, int initialUnitsOnHand, double initialPrice)
            throws NegativeUnitsOnHand, NegativePrice {
        if (initialUnitsOnHand < 0) {
            throw new NegativeUnitsOnHand(initialUnitsOnHand);
        }
        if (initialPrice < 0) {
            throw new NegativePrice(initialPrice);
        }
        {
            description = initialDescription;

            // hint: see BankAccount.java in Ch 10 demo files
            unitsOnHand = initialUnitsOnHand;

            // hint: see BankAccount.java in Ch 10 demo files
            price = initialPrice;
        }
    }

    /**
     * The getDespcription method returns the value in the description field.
     *
     * @return The value in the description field.
     */
    public String getDescription() {
        return description;
    }

    /**
     * The setDescriptions method stores a value in the newDescription field.
     *
     * @param newDescription value to store in description
     */
    public void setDescription(String newDescription) {
        description = newDescription;
    }

    /**
     * The getUnitsOnHand method returns the value in the unitsOnHand field.
     *
     * @return The value in the unitsOnHand field.
     */
    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    /**
     * The setUnitsOnHand method stores a value in the newUnitsOnHand field.
     *
     * @param newUnitsOnHand The value to store in unitsOnHand.
     */
    public void setUnitsOnHand(int newUnitsOnHand) throws NegativeUnitsOnHand {
        // hint: see BankAccount.java in Ch 10 demo files
        if (newUnitsOnHand < 0) {
            throw new NegativeUnitsOnHand(newUnitsOnHand);
        }
        unitsOnHand = newUnitsOnHand;
    }

    /**
     * The setPrice method stores a value in the newPrice field.
     *
     * @return The value in the price field.
     */
    public double getPrice() {
        return price;
    }

    /**
     * The setPrice method stores a value in the newPrice field.
     *
     * @param newPrice The value to store in newPrice
     */
    public void setPrice(double newPrice) throws NegativePrice {
        // hint: see BankAccount.java in Ch 10 demo files
        if (newPrice < 0) {
            throw new NegativePrice(newPrice);
        }

        price = newPrice;
    }

}
