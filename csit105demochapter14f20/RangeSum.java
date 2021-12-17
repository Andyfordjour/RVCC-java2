package csit105demochapter14f20;

/**
 * This program demonstrates the recursive rangeSum method.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */

public class RangeSum {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        //        index  0  1  2  3  4  5  6  7  8
        int[] numbers = {8, 6, 7, 5, 3, 0, 9, 1, 4};

        System.out.println("The sum of elements 3 through 7 is "
                + rangeSum(numbers, 3, 7));
    }

    /**
     * The rangeSum method returns the sum of a specified range of elements in
     * array - The start parameter specifies the starting element and the end
     * parameter specifies the ending parameter.
     *
     * @param array the int array to be summed
     * @param start the index to begin the sum
     * @param end the index to end the sum
     * @return sum of the range
     */
    public static int rangeSum(int[] array, int start, int end) {
        int valueToReturn;
        
        if (start > end) {
            valueToReturn = 0;
        } else {
            valueToReturn = array[start] 
                    + rangeSum(array, start + 1, end);
        }

        return valueToReturn;
    }
}
