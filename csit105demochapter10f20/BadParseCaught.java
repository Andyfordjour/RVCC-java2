package csit105demochapter10f20;

/**
 * This program handles a parse error
 */

public class BadParseCaught {

    public static void main(String[] args) {
        String sourceString1, sourceString2;
        int convertedInt1, convertedInt2;

        sourceString1 = "7812";
        try {
            convertedInt1 = Integer.parseInt(sourceString1);
            System.out.println("1: \"" + sourceString1 + "\" is " + convertedInt1);
        } catch (NumberFormatException e) {
            System.out.println("1: \"" + sourceString1 + "\" can't be converted");
        }

        sourceString2 = "eight";
        try {
            convertedInt2 = Integer.parseInt(sourceString2);
            System.out.println("2: \"" + sourceString2 + "\" is " + convertedInt2);
        } catch (NumberFormatException e) {
            System.out.println("2: \"" + sourceString2 + "\" can't be converted to an integer");
        }

    }
}
