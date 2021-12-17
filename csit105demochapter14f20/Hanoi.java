package csit105demochapter14f20;

import java.util.Stack; // Note: in CSIT 254 Data Structures we
                        // learn how to write the Stack class

/**
 * This class is a solution to the Towers of Hanoi game.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */

public class Hanoi {

    private int numDiscs;   // Number of discs

    // create 3 pegs as Stack of String
    private Stack<String> peg1 = new Stack<String>();
    private Stack<String> peg2 = new Stack<String>();
    private Stack<String> peg3 = new Stack<String>();

    /**
     * Constructor
     *
     * @param n the number of discs to use.
     */
    public Hanoi(int n) {
        // Assign the number of discs.
        numDiscs = n;

        // load peg1 with n discs
        for (int disc = n; disc > 0; disc--) {
            peg1.push(Integer.toString(disc));
        }

        // display pegs
        displayPegs();

        // Move the number of discs from peg 1 to peg 3
        // using peg 2 as a temporary storage location.
        moveDiscs(numDiscs, 1, 3, 2);
    }

    /**
     * The moveDiscs method uses recursion to display the necessary disc moves.
     *
     * @param num the number of discs to move
     * @param fromPeg the peg to move from
     * @param toPeg the peg to move to
     * @param tempPeg the temporary peg
     */
    private void moveDiscs(int num, int fromPeg, int toPeg,
            int tempPeg) {
        String disc;
        if (num > 0) {
            moveDiscs(num - 1, fromPeg, tempPeg, toPeg);
            System.out.println("\nMove a disc from peg "
                    + fromPeg + " to peg " + toPeg);
            // pop from "peg" stack
            switch (fromPeg) {
                case 1:
                    disc = peg1.pop();
                    break;
                case 2:
                    disc = peg2.pop();
                    break;
                default:
                    disc = peg3.pop();
                    break;
            }
            // push to "peg" stack
            switch (toPeg) {
                case 1:
                    peg1.push(disc);
                    break;
                case 2:
                    peg2.push(disc);
                    break;
                default:
                    peg3.push(disc);
                    break;
            }
            // display pegs
            displayPegs();
            moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
        }
    }

    /**
     * displays the pegs to the console.  (Not the best way)
     */
    public void displayPegs() {
        if (peg1.isEmpty())
            System.out.println("Peg 1: empty");
        else {
            System.out.println("Peg 1:");
            for (int i = (peg1.size()-1); i >=0 ; i--) {
                System.out.print("\t" + peg1.elementAt(i)); 
                if (i == (peg1.size()-1) && i==0)
                    System.out.println(" <== top&bottom");
                else if (i == (peg1.size()-1))
                    System.out.println(" <== top");
                else if (i==0)
                    System.out.println(" <== bottom");
                else
                    System.out.println();
            }
        }

        if (peg2.isEmpty())
            System.out.println("\n\t\tPeg 2: empty");
        else {
            System.out.println("\n\t\tPeg 2:");
            for (int i = (peg2.size()-1); i >=0 ; i--) {
                System.out.print("\t\t\t" + peg2.elementAt(i));                
                if (i == (peg2.size()-1) && i==0)
                    System.out.println(" <== top&bottom");
                else if (i == (peg2.size()-1))
                    System.out.println(" <== top");
                else if (i==0)
                    System.out.println(" <== bottom");
                else
                    System.out.println();
                
            }
        }

        if (peg3.isEmpty())
            System.out.println("\n\t\t\t\tPeg 3: empty");
        else {
            System.out.println("\n\t\t\t\tPeg 3:");
            for (int i = (peg3.size()-1); i >=0 ; i--) {
                System.out.print("\t\t\t\t\t" + peg3.elementAt(i));                
                if (i == (peg3.size()-1) && i==0)
                    System.out.println(" <== top&bottom");
                else if (i == (peg3.size()-1))
                    System.out.println(" <== top");
                else if (i==0)
                    System.out.println(" <== bottom");
                else
                    System.out.println();
                
            }
        }
        
    }
}
