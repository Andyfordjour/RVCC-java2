package csit105project03vendingmachinef20;

/**
 * Demo of superclass Food from, modified with price added
 *
 * @author Stephen T. Brower
 */
public class Food {

    private String description;
    private int calories;
    private double price;

    /**
     * Constructor
     *
     * @param initialDescription value for the description field
     * @param initialCalories value for the calories field
     * @param initialPrice value for the price field
     */
    public Food(String initialDescription, int initialCalories,
            double initialPrice) {
        description = initialDescription;
        calories = initialCalories;
        price = initialPrice;
    }

    /**
     * getDescription method returns the value from the description field
     *
     * @return value from the description field
     */
    public String getDescription() {
        return description;
    }

    /**
     * setDescription method assigns a new value for the description field
     *
     * @param newDescription new value for the description field
     */
    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    /**
     * getCalories method returns the value from the calories field
     *
     * @return value from the calories field
     */
    public int getCalories() {
        return calories;
    }

    /**
     * setCalories assigns a new value for the calories field
     *
     * @param newCalories new value for the calories field
     */
    public void setCalories(int newCalories) {
        this.calories = newCalories;
    }

    /**
     * getPrice method returns the value from the price field
     * @return value from the price field
     */
    public double getPrice() {
        return price;
    }

    /**
     * newPrice method assigns a new value for the price field
     * @param newPrice new value for the price field
     */
    public void setPrice(double newPrice) {
        price = newPrice;
    }

    /**
     * toString method returns a String that represents this object
     *
     * @return String that represents this object
     */
    @Override
    public String toString() {
        return "Food " + description + " cal: " + calories +
                " price: " + String.format("%,.2f",price);
    }
}
