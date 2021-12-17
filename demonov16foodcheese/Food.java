package demonov16foodcheese;

/**
 * Demo of superclass Food
 *
 * @author Stephen T. Brower
 */
public class Food {

    private String description;
    private int calories;

    /**
     * Constructor
     *
     * @param initialDescription value for the description field
     * @param initialCalories value for the calories field
     */
    public Food(String initialDescription, int initialCalories) {
        description = initialDescription;
        calories = initialCalories;
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
     * toString method returns a String that represents this object
     *
     * @return String that represents this object
     */
    @Override
    public String toString() {
        return "Food " + description + " cal: " + calories;
    }
}
