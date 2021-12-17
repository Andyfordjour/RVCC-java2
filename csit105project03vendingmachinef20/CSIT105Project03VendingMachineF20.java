package csit105project03vendingmachinef20;

import java.util.Scanner;

/**
 *
 * @author Stephen T. Brower, modified by ???
 */
public class CSIT105Project03VendingMachineF20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VendingMachine myMachine = new VendingMachine();
        String userChoice;
        Scanner input = new Scanner(System.in);
        Cheese itemReturned;

        int rowEntered, colEntered;

        myMachine.displayInventory();

        do {

            System.out.printf("\nBalance: %.2f\n", myMachine.getBalance());

            System.out.print("\nEnter Money(Q,D,N,B for Bill) or command (R, P, I, X): ");
            userChoice = input.nextLine();

            switch (userChoice.toUpperCase()) {
                case "Q":
                    myMachine.addMoney(MoneyType.QUARTER);
                    break;
                case "D":
                    myMachine.addMoney(MoneyType.DIME);
                    break;
                case "N":
                    myMachine.addMoney(MoneyType.NICKEL);
                    break;
                case "B":
                    myMachine.addMoney(MoneyType.DOLLAR_BILL);
                    break;
                case "I":
                    myMachine.displayInventory();
                    break;
                case "P":

                    // your logic here
                    //the if statement for the money return of the purchase
                    System.out.print("\nEnter Row: ");
                    rowEntered = input.nextInt();
                    System.out.print("Enter Col: ");
                    colEntered = input.nextInt();
                    input.nextLine();
                    if (myMachine.validCoordinates(rowEntered, colEntered)) {
                        itemReturned = myMachine.dispenseProduct(rowEntered,
                                colEntered);
                        if (itemReturned == null) {
                            System.out.println("\nUnable to dispense!");
                        } else {
                            System.out.printf("\nReceived Product: %s\n",
                                    itemReturned);
                            //if statement for the return balance  
                            if (myMachine.getBalance() > 0) {

                                System.out.printf("\nmoney return %.2f!\n", myMachine.returnMoney());
                            } else {
                                System.out.println("\n nothing to return");
                            }

                        }
                    }
                    break;

                case "X":
                    if (myMachine.getBalance() > 0) {
                        System.out.printf("\nYou're walking away from %.2f!\n", myMachine.getBalance());
                    }
                    System.out.println("\nBye Bye!");
                    break;
                case "R":

                    // your logic here
                    //if statement for the return statement
                    if (myMachine.getBalance() > 0) {
                        System.out.printf("\nmoney return %.2f!\n", myMachine.returnMoney());
                    } else {
                        System.out.println("\n nothing to return");
                    }

                    break;
                default:
                    System.out.println("\nInvalid Coin or Bill or Command");
            }

        } while (!(userChoice.equalsIgnoreCase("X")));

    }

}
