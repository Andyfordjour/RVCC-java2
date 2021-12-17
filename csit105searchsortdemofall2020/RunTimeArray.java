package csit105searchsortdemofall2020;

import java.util.Random;

/**
 * This class is to maintain an array with enough support just for 
 * the run-time demos
 * @author Stephen T. Brower
 */
public class RunTimeArray {
    private int maxValueForElement;
    private int[] largeArray;
    
    /**
     * Constructor
     * @param numElements the number of elements for the array
     * @param initialMaxValueForElement the max value for each element 
     * in the array
     */
    public RunTimeArray(int numElements, int initialMaxValueForElement)
    {
        largeArray = new int[numElements];
        maxValueForElement = initialMaxValueForElement;
        generateArray();
    }
    
    /**
     * the getArray method returns a pointer to the array.
     * this is potentially dangerous as all of the contents can
     * be changed, but can be useful too such as for the sort.
     * @return pointer to the array of int
     */
    public int[] getArray()
    {
        return largeArray;
    }
    /**
     * the getArrayLength returns the .length of the array
     * @return the .length of the array
     */
    public int getArrayLength()
    {
        return largeArray.length;
    }
    
    /**
     * the generateArray method will populate all elements of the 
     * array in the range of 1..maxValueForElement
     */
    private void generateArray()
    {
        Random randomNumbers = new Random();
        
        for (int i = 0; i < largeArray.length; i++)
        {
            largeArray[i] = 1 + randomNumbers.nextInt(maxValueForElement);
        }
    }  
    
    
    /**
     * the displayArray method will display the contents of the array
     * in #,### format
     * @param label a String to display before the array
     */
    public  void displayArray( String label )
    {
        System.out.println("\n"+label);
        
        for (int i = 0; i < largeArray.length; i++)
            System.out.printf("%,d ",largeArray[i]);
        
        System.out.println();
    }    
    
    /**
     * the getMaxValueForElement method returns the potentially maximum value 
     * for the elements in the array
     * @return value from the maxValueForElement field
     */
    public int getMaxValueForElement()
    {
        return maxValueForElement;
    }    
}
