package csit105demochapter10f20;

/**
 * This program causes an error and crashes.
 */

public class BadParse {

    public static void main(String[] args) {
        String sourceString1, sourceString2;
        int convertedInt1, convertedInt2;

        sourceString1 = "7812";
        convertedInt1 = Integer.parseInt(sourceString1);
        System.out.println("1: " + sourceString1 + " is " + convertedInt1);

        sourceString2 = "eight";
        convertedInt2 = Integer.parseInt(sourceString2);
        System.out.println("2: " + sourceString1 + " is " + convertedInt2);

    }
}
