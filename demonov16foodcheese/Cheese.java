package demonov16foodcheese;

/**
 *
 * @author Stephen T. Brower
 */
public class Cheese extends Food {

    private int monthsAged;

    /**
     * Constructor
     * @param initialDescription value for the description field
     * @param initialCalories value for the calories field
     * @param initialMonthsAged value for the monthsAged field
     */
    public Cheese(String initialDescription, int initialCalories,
            int initialMonthsAged) {
        super(initialDescription, initialCalories);
        monthsAged = initialMonthsAged;
    }

    /**
     * getMonthsAged method returns value from the monthsAged field
     *
     * @return value from the monthsAged field
     */
    public int getMonthsAged() {
        return monthsAged;
    }

    /**
     * setMonthsAged assigns a new value for the monthsAged field
     *
     * @param newMonthsAged new value for the monthsAged field
     */
    public void setMonthsAged(int newMonthsAged) {
        this.monthsAged = newMonthsAged;
    }

    /**
     * toString method returns a String that represents this object
     *
     * @return String that represents this object
     */
    @Override
    public String toString() {
        return "Cheese: D: " + getDescription()
                + " C: " + getCalories() + " aged: " + monthsAged;
    }
}
