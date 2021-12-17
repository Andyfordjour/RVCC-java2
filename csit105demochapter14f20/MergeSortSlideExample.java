package csit105demochapter14f20;

/**
 * This program demonstrates recursion using a Data Structure Date Written:
 * 11/3/2008 Date Modified: 7/16/2013 - changed to mergeSort()
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class MergeSortSlideExample {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // declare variables
        final int MAX_VALUE = 8;
        int array[] = {8, 6, 7, 5, 3, 0, 9, 1};
        int i;

        displayArray(array, "Array before Sort", 0, array.length);

        mergeSort(array, 0, array.length);

        displayArray(array, "Array after Sort", 0, array.length);
    }

    /**
     * mergeSort is a recursive method to sort an array of int
     *
     * @param data "pointer" to array of int to be sorted
     * @param first index of first element to look at
     * @param n number of elements to look at
     */
    public static void mergeSort(int[] data, int first, int n) {
        int n1; // size of left half
        int n2; // size of right half

        if (n > 1) {
            n1 = n / 2;
            n2 = n - n1;

            displayArray(data, "Left", first, n1);
            // sort left
            mergeSort(data, first, n1);

            displayArray(data, "Right", first + n1, n2);
            // sort right
            mergeSort(data, first + n1, n2);

            displayArray(data, "Before Merge Left and Right", first, n1 + n2);
            // now merge the left and right
            merge(data, first, n1, n2);

            displayArray(data, "After Merge", first, n1 + n2);

        }
    }

    /**
     * merge method merges two parts of the array as one - helper to mergeSort()
     *
     * @param data "pointer" to array of int to be sorted
     * @param first index of first element to look at
     * @param n1 number of elements on left
     * @param n2 number of elements on right
     */
    private static void merge(int[] data, int first, int n1, int n2) {
        int[] temp = new int[n1 + n2];
        int tempIndex = 0;  // index for array being populated
        int leftIndex = 0;  // index for array on left
        int rightIndex = 0; // index for array on right

        while ((leftIndex < n1) && (rightIndex < n2)) {

            if (data[first + leftIndex] < data[first + n1 + rightIndex]) {
                temp[tempIndex] = data[first + (leftIndex)];
                tempIndex++;
                leftIndex++;
            } else {
                temp[tempIndex] = data[first + n1 + (rightIndex)];
                tempIndex++;
                rightIndex++;
            }
        }

        // copy any extra items on the left
        while (leftIndex < n1) {
            temp[tempIndex] = data[first + (leftIndex)];
            tempIndex++;
            leftIndex++;
        }

        // copy any extra items on the right
        while (rightIndex < n2) {
            temp[tempIndex] = data[first + n1 + (rightIndex)];
            tempIndex++;
            rightIndex++;
        }

        // copy from temp back to data
        for (int i = 0; i < n1 + n2; i++) {
            data[first + i] = temp[i];
        }

    }

    /**
     * displayArray method displays a portion of the array
     *
     * @param data data "pointer" to array of int to be sorted
     * @param header String to display before array
     * @param first index of first element to display from
     * @param n number of elements to display from first
     */
    public static void displayArray(int[] data, String header, int first, int n) {
        System.out.printf("\n%s\n", (header + " n=" + n + " starting at " + first));

        for (int i = 0; i < n; i++) {
            System.out.printf("%5d ", data[first + i]);
        }

        System.out.println();
    }
}
