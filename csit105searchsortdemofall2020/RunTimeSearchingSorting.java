package csit105searchsortdemofall2020;

/**
 * This is a compilation of code from Ch 02 of Data Structures Essentials
 * by Roman Lysecky and Frank Vahid. The code from the book was tweaked
 * by Stephen Brower to run in Java
 * @author Stephen T. Brower
 */
public class RunTimeSearchingSorting {
    /**
     * the linearSearch method assumes the array is not sorted and uses a
     * linear search to find the key value in the numbers array
     * @param numbers the array to be searched
     * @param numbersSize the number of elements populated in the array
     * @param key the value to look for in the array
     * @return either in index of the element with the value or -1 if not found
     */
    public static int linearSearch(int[] numbers, int numbersSize, int key) {
        int i;

        for (i = 0; i < numbersSize; ++i) {
            if (numbers[i] == key) {
                return i;
           }
        }

        return -1; // not found
    }
   
    /**
     * the binarySearch method assumes the array is sorted and uses a
     * binary search to find the key value in the numbers array
     * @param numbers the array to be searched
     * @param numbersSize the number of elements populated in the array
     * @param key the value to look for in the array
     * @return either in index of the element with the value or -1 if not found
     */
    public static int binarySearch(int[] numbers, int numbersSize, int key) {
        int mid = 0;
        int low = 0;
        int high = numbersSize - 1;

        while (high >= low) {
            mid = (high + low) / 2;
            if (numbers[mid] < key) {
                low = mid + 1;
            }
            else if (numbers[mid] > key) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }

        return -1; // not found 
    }
   
    /**
     * the selectionSort method sorts the array
     * @param numbers the array to be sorted
     * @param numbersSize the number of elements populated in the array
     */
    public static void selectionSort(int[] numbers, int numbersSize) {
        int i = 0;
        int j = 0;
        int indexSmallest = 0;
        int temp = 0;  // Temporary variable for swap

        for (i = 0; i < numbersSize - 1; ++i) {
            // Find index of smallest remaining element
            indexSmallest = i;
            for (j = i + 1; j < numbersSize; ++j) {
                if ( numbers[j] < numbers[indexSmallest] ) {
                    indexSmallest = j;
                }
            }

            // Swap numbers[i] and numbers[indexSmallest]
            temp = numbers[i];
            numbers[i] = numbers[indexSmallest];
            numbers[indexSmallest] = temp;
        }
    }    
}
