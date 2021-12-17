package csit105project03vendingmachinef20;

/**
 *
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class BatchTestVendingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VendingMachine myMachine = new VendingMachine();
        int returnValue = 0;
        double moneyReturned;
        Cheese cheeseReturned;

        System.out.println("VendingMachine Class Tester\n");

        System.out.println("\nTest :A ******************************************************************************");

        System.out.println("displayInventory() { visually inspect }:");
        myMachine.displayInventory();

        System.out.printf("\ngetBalance(): %.2f", myMachine.getBalance());

        if ( Math.abs(myMachine.getBalance()) < 0.000001)
            System.out.println(" - good");
        else {
            System.out.println("\t\t<== unexpected value");
            returnValue++;
        }

        System.out.println("\nTest :B ******************************************************************************");

        System.out.print("\nadd 1 each of MoneyType NICKEL DIME QUARTER");
        System.out.println(" DOLLAR_BILL -- should have 1.40 after all adds\n");
        // System.out.println(" BILL");

        myMachine.addMoney(MoneyType.NICKEL);
        System.out.printf("getBalance(): %.2f", myMachine.getBalance());

        if ( Math.abs(myMachine.getBalance()-.05) < 0.000001)
            System.out.println(" - good");
        else {
            System.out.println("\t\t<== unexpected value");
            returnValue++;
        }

        myMachine.addMoney(MoneyType.DIME);
        System.out.printf("getBalance(): %.2f", myMachine.getBalance());

        if ( Math.abs(myMachine.getBalance()-.15) < 0.000001)
            System.out.println(" - good");
        else {
            System.out.println("\t\t<== unexpected value");
            returnValue++;
        }

        myMachine.addMoney(MoneyType.QUARTER);
        System.out.printf("getBalance(): %.2f", myMachine.getBalance());

        if ( Math.abs(myMachine.getBalance()-.40) < 0.000001)
            System.out.println(" - good");
        else {
            System.out.println("\t\t<== unexpected value");
            returnValue++;
        }

        myMachine.addMoney(MoneyType.DOLLAR_BILL);
        System.out.printf("getBalance(): %.2f", myMachine.getBalance());

        if ( Math.abs(myMachine.getBalance()-1.40) < 0.000001)
            System.out.println(" - good");
        else {
            System.out.println("\t\t<== unexpected value");
            returnValue++;
        }
        // myMachine.addMoney(MoneyType.BILL);

        System.out.println("\nTest :C ******************************************************************************");

        System.out.println("\nreturnMoney() - should get 1.40 and balance should be 0\n");

        moneyReturned = myMachine.returnMoney();

        System.out.printf("returnMoney(): %.2f", moneyReturned);

        if ( Math.abs(moneyReturned - 1.40) < 0.000001)
            System.out.println(" - good");
        else {
            System.out.println("\t\t<== unexpected value");
            returnValue++;
        }

        System.out.printf("getBalance(): %.2f", myMachine.getBalance());

        if ( Math.abs(myMachine.getBalance()) < 0.000001)
            System.out.println(" - good");
        else {
            System.out.println("\t\t<== unexpected value");
            returnValue++;
        }

        System.out.println("\nTest :D ******************************************************************************");

        System.out.println("\nNow add $2.25");

        myMachine.addMoney(MoneyType.DOLLAR_BILL);
        myMachine.addMoney(MoneyType.DOLLAR_BILL);
        myMachine.addMoney(MoneyType.QUARTER);

        System.out.printf("getBalance(): %.2f", myMachine.getBalance());

        if ( Math.abs(myMachine.getBalance()-2.25) < 0.000001)
            System.out.println(" - good");
        else {
            System.out.println("\t\t<== unexpected value");
            returnValue++;
        }

        System.out.println("\nTest :E ******************************************************************************");

        System.out.print("\nvalidCoordinates(10,10) {should be invalid} ");

        if (!myMachine.validCoordinates(10, 10))
            System.out.println(" - good");
        else {
            System.out.println("\t\t<== unexpected value");
            returnValue++;
        }

        System.out.print("\nvalidCoordinates(0,0) {should be valid} ");

        if (myMachine.validCoordinates(0, 0))
            System.out.println(" - good");
        else {
            System.out.println("\t\t<== unexpected value");
            returnValue++;
        }

        System.out.println("\nTest :F ******************************************************************************");

        System.out.println("\ndispenseProduct(0,0), call returnMoney(), getBalance() should be 0");


        cheeseReturned = myMachine.dispenseProduct(0, 0);

        if (cheeseReturned == null) {
            System.out.println("\nNothing dispensed!");
        } else {
            System.out.printf("\ncheeseReturned.getDescription(): %s\n", cheeseReturned.getDescription());
            if (myMachine.getBalance() > 0) {
                System.out.printf("\nCall returnMoney(): %.2f\n", myMachine.returnMoney());
            } else {
                System.out.println("\nNo money to return!");
            }
        }

        System.out.printf("\ngetBalance(): %.2f", myMachine.getBalance());

        if ( Math.abs(myMachine.getBalance()) < 0.000001)
            System.out.println(" - good");
        else {
            System.out.println("\t\t<== unexpected value");
            returnValue++;
        }

        System.out.println("\nTest Summary ******************************************************************************");

        if (returnValue == 0)
            System.out.println("\nAll tests Good");
        else
            System.out.println("\n\t\t\t*** issues ***\treturn value: " +returnValue);

    }

}
