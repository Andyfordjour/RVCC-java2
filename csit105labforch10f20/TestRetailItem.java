package csit105labforch10f20;

/**
 * BEFORE ADDING LINES TO THIS FILE - NOTE LINE #s 17 and 41-45 below
 *
 * @author Stephen T. Brower, modifed by Andy fordjour
 */
public class TestRetailItem {

    /**
     * main method - driver for Lab 12 for Ch 10
     *
     * @param args command line arguments
     */
    public static void main(String args[]) {

        // this will test instantiation     remove // on next line
        try {

            // if you change a number value in the array to be negative, the
            // instantiation catch (line 41) will catch it
            RetailItem[] itemInStock = {new RetailItem("Jacket", 12, 59.95),
                new RetailItem("Designer Jeans", 40, 34.95),
                new RetailItem("Shirt", 20, 24.95)};

            displayInventory("Inventory initially", itemInStock);

            for (int i = 0; i < itemInStock.length; i++) {
                // add try here for setting units on hand - hint: see line 17
                try {
                    itemInStock[i].setUnitsOnHand(itemInStock[i].getUnitsOnHand() - 20);
                }// add catch here for setting units on hand - hint: see lines 41-45
                catch (NegativeUnitsOnHand e) {
                    System.out.println("Cannot reduce units on hand for " + itemInStock[i].getDescription()
                            + " Error: Negative units on hand:" + (itemInStock[i].getUnitsOnHand() - 20));
                }
                // add try here for setting price - hint: see line 17
                try {
                    itemInStock[i].setPrice(itemInStock[i].getPrice() - 35.00);
                }// add catch here for setting price - hint: see lines 41-45
                catch (NegativePrice e) {
                    System.out.println("Cannot reduce price for " + itemInStock[i].getDescription()
                            + "" + " Error: Negative price: " + (itemInStock[i].getPrice() - 35.00));
                }
            }

            displayInventory("Inventory after decrementing", itemInStock);

            // this will catch error on instantiation       remove /* line 41 and */ line 45
        } catch (NegativeUnitsOnHand e) {
            System.out.println("Cannot instantiate array of RetailItem " + e.getMessage());
        } catch (NegativePrice e) {
            System.out.println("Cannot instantiate array of RetailItem " + e.getMessage());
        }

    }

    /**
     * displayInventory will display a label and the array of RetailItem passed
     *
     * @param label String to display before the array
     * @param stockToDisplay array of RetailItem to display
     */
    public static void displayInventory(String label, RetailItem[] stockToDisplay) {
        System.out.println("\n" + label + "\n");
        System.out.printf("%-4s %-15s %5s %8s\n", "Item", "Description", "Units", "Price");
        for (int i = 0; i < stockToDisplay.length; i++) {
            System.out.printf("%4d %-15s %5d %,8.2f\n", i, stockToDisplay[i].getDescription(),
                    stockToDisplay[i].getUnitsOnHand(),
                    stockToDisplay[i].getPrice());
        }

    }
}
