package csit105project03vendingmachinef20;

/**
 * VendingMachine class for Project 3
 *
 * @author Stephen T. Brower, modified by: Andy Fordjour
 */
public class VendingMachine {

    private double balance;
    private Cheese[][] inventory
            = {{new Cheese("Cheddar", 150, 2.25, 3), new Cheese("Gouda", 175, 3.75, 6),
                new Cheese("Swiss", 150, 1.75, 2)},
            {new Cheese("Monterey Jack", 200, 2.90, 6), new Cheese("Monchego", 120, 6.25, 2)},
            {new Cheese("Blue Cheese", 310, 4.25, 4), new Cheese("Danby", 110, 3.30, 4),
                new Cheese("Havarti", 175, 1.75, 3), new Cheese("Feta", 425, 3.85, 4),
                new Cheese("Provolone", 130, 4.25, 4)},
            {new Cheese("Alpine Lace", 90, 2.35, 2), new Cheese("Colby Jack", 190, 2.20, 3)},
            {new Cheese("Jarlesberg", 75, 3.45, 2), new Cheese("Colby", 95, .90, 1),
                new Cheese("Muenster", 350, 2.80, 4)}
            };

    /**
     * Constructor
     */
    public VendingMachine() {
        balance = 0;
    }

    /**
     * getBalance method returns the value in the balance field
     *
     * @return value in the balance field
     */
    public double getBalance() {
        return balance;
    }

    /**
     * addMoney method increases the balance by the MoneyType enumeration sent
     *
     * @param newMoney the enum type to indicate the money added
     */
    public void addMoney(MoneyType newMoney) {
        // your logic here
        switch (newMoney) {
            case NICKEL:
                balance += 0.05;
                break;
            case DIME:
                balance += 0.10;
                break;
            case QUARTER:
                balance += 0.25;
                break;
            case DOLLAR_BILL:
                balance += 1.00;
                break;
            default:
                System.out.println("Unknown currency");

        }
    }

    /**
     * displays the inventory to the console
     */
    public void displayInventory() {
        int maxRowLength = 0;
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].length > maxRowLength) {
                maxRowLength = inventory[i].length;
            }
        }
        System.out.print("\nInventory:\n   ");
        for (int j = 0; j < maxRowLength; j++) {
            System.out.printf("%20d ", j);
        }
        System.out.print("\n   ");
        for (int j = 0; j < maxRowLength; j++) {
            System.out.printf("%20s ", "--------------------");
        }
        System.out.println();
        for (int i = 0; i < inventory.length; i++) {
            System.out.printf("%2d ", i);
            for (int j = 0; j < inventory[i].length; j++) {
                System.out.printf("%-15s %4.2f ", inventory[i][j].getDescription(),
                        inventory[i][j].getPrice());
            }
            System.out.println();
        }
    }

    /**
     * dispenseProduct method checks to see if the cost for the item at row,col
     * is <= balance and if so,the balance is reduced by the itemCost and it
     * returns a Snack. If the balance is not enough, null is returned @param
     * row value for row for item @param col value for col for item @return
     * Snack item or null if not dispensed
     *
     */
    public Cheese dispenseProduct(int row, int col) {
        Cheese returnItem;

        returnItem = null; // replace with your logic

        if (validCoordinates(row, col) && inventory[row][col].getPrice() <= balance) {
            balance -= inventory[row][col].getPrice();
            returnItem = inventory[row][col];
        } else if (inventory[row][col].getPrice() >= balance) {
            returnItem = null;
        }

        return returnItem;
    }

    /**
     * returnMoney returns the balance and then resets the balance to 0
     *
     * @return the amount of money returned
     */
    public double returnMoney() {
        double returnValue = balance;
        balance = 0;
        // returnValue = 0;// replace with your logic

        return returnValue;
    }

    /**
     * validCoordinates checks if the row,col passed is valid for this
     * VendingMachine
     *
     * @param row the row to be checked
     * @param col the col to be checked
     * @return whether the row,col is valid or not
     */
    public boolean validCoordinates(int row, int col) {
        boolean isValid;

        isValid = false; // replace with your logic

        if (row < 0) {
            isValid = false;
        } else if (row >= inventory.length) {
            isValid = false;
        } else if (col < 0) {
            isValid = false;
        } else if (col >= inventory[row].length) {
            isValid = false;
        } else {
            isValid = true;
        }

        return isValid;
    }

}
