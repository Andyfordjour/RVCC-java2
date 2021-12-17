package csit105demochapter10f20;

/**
 * This program demonstrates how the InventoryItem class throws exceptions.
 *
 * @author Tony Gaddis (et al)
 */

public class InventoryDemo {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InventoryItem item = null;

        // Try to assign an empty string to the
        // description field.
        try {
            item = new InventoryItem("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        displayItem(item);

        // Again, try to assign an empty string to
        // the description field.
        try {
            item = new InventoryItem("", 5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        displayItem(item);

        // Try to assign a negative number to the
        // units field.
        try {
            item = new InventoryItem("Wrench", -1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        displayItem(item);

        // Try to get this to work!
        try {
            item = new InventoryItem("Wrench", 11);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        displayItem(item);

    }

    public static void displayItem(InventoryItem itemToDisplay) {
        if (itemToDisplay != null) {
            System.out.printf("Item Exists:  Desc: %s, Units: %d\n\n", itemToDisplay.getDescription(),
                    itemToDisplay.getUnits());
        } else {
            System.out.printf("Item does not exist\n\n");
        }
    }
}
