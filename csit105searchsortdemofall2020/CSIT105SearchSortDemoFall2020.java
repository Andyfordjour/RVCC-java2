package csit105searchsortdemofall2020;

import java.util.Scanner;

/**
 * Demo to illustrate importance of run-time analysis.
 * This was a lab from a different course from a different semester.
 * @author Stephen T. Brower
 */
public class CSIT105SearchSortDemoFall2020 {

    /**
     * this main method is the starting point
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        System.out.println("////////////////////////////////////////////////////////////////");
        System.out.println("//");
        System.out.println("// when this was a lab for another class, the lab sheet said to ");
        System.out.println("// manually change the 'constants' for four different runs.");
        System.out.println("//");
        System.out.println("// For this demo, the 4 different runs are options");
        System.out.println("//");
        System.out.println("////////////////////////////////////////////////////////////////");
        
        
        Scanner keyboard = new Scanner(System.in);
        
        String userSelection;
        
        do {
            System.out.println("\nTest runs:");
            System.out.println("\t1 -      10 elements,      10 searches");
            System.out.println("\t2 -  10,000 elements, 100,000 searches");
            System.out.println("\t3 - 100,000 elements, 100,000 searches");
            System.out.println("\t4 - 300,000 elements, 100,000 searches");
            System.out.print("\nEnter test run (1-4, x to exit): ");
            userSelection = keyboard.nextLine();
            
            switch (userSelection.toUpperCase()) {
                case "1":
                    runTimeDemo(10,10,true,true);
                    break;
                case "2":
                    runTimeDemo(10000,100000,false,false);
                    break;
                case "3":
                    runTimeDemo(100000,100000,false,false);
                    break;
                case "4":
                    runTimeDemo(300000,100000,false,false);
                    break;
                case "X":
                    System.out.println("\nBye!");
                    break;
                default:
                    System.out.println("\ninvalid selection");
            }
            
        } while ( !(userSelection.equalsIgnoreCase("x")));
        
        
        
    }
    
    /**
     * runTimeDemo method creates an array with the number of elements, provided, 
     * performs a number of linear searches, performs a selection sort, 
     * final performs a number of binary searches.
     * @param numberOfElements value for the number of elements to hold in the array
     * @param numberOfSearchesToPerform value for the number of searches to perform ( linear and binary )
     * @param displayArray flag for displaying the array
     * @param displaySearchResults flag for providing details of the search results
     */
    public static void runTimeDemo(int numberOfElements, int numberOfSearchesToPerform, boolean displayArray, boolean displaySearchResults) {
        
        final int MAX_VALUE = 1000000;
        
        System.out.printf("\nCreating and generating array of %,d elements:\n", numberOfElements);
        RunTimeArray myArray = new RunTimeArray(numberOfElements, MAX_VALUE);
        System.out.println("\tgenerated.");

        System.out.printf("\n# of elements in Array: %,d\n", myArray.getArrayLength());
        System.out.printf("values generated in range 1 - %,d\n", MAX_VALUE);

        if (displayArray) {
            System.out.println("display array mode on");
        } else {
            System.out.println("display array mode off");
        }

        if (displaySearchResults) {
            System.out.println("display search results mode on");
        } else {
            System.out.println("display search results mode off");
        }

        if (displayArray) {
            myArray.displayArray("unsorted array:");
        }

        performMultipleLinearSearch(myArray, numberOfSearchesToPerform, displaySearchResults);

        sortArray(myArray);

        if (displayArray) {
            myArray.displayArray("\nsorted array:");
        }

        performMultipleBinarySearch(myArray, numberOfSearchesToPerform, displaySearchResults);

    }

    /**
     * the performMultipleLinearSearch will call the linearSearch multiple times
     * based on the numSearches passed and will display the total nano time for
     * those searches
     *
     * @param arrayToSearch the ArrayCh02 object which manages the array.
     * @param numSearches the number of searches to perform
     */
    public static void performMultipleLinearSearch(RunTimeArray arrayToSearch,
            int numSearches, boolean displaySearchResult) {
        int target;
        int returnIndex;
        long startTime, stopTime, timeDifference;
        long totalNanoTime = 0;

        System.out.printf("\nPerforming %,d Linear Searches: ",numSearches);

        for (int numSearch = 1; numSearch <= numSearches; numSearch++) {
            // note starting time
            startTime = System.nanoTime();

            // generate target value
            target = (int) (1 + Math.random() * arrayToSearch.getMaxValueForElement());

            // search for target in array
            returnIndex = RunTimeSearchingSorting.linearSearch(arrayToSearch.getArray(),
                    arrayToSearch.getArrayLength(), target);

            // note ending time
            stopTime = System.nanoTime();

            // what's the difference?
            timeDifference = stopTime - startTime;

            // accumulate time
            totalNanoTime += timeDifference;

            if (displaySearchResult) {
                System.out.printf("(%,d)", target);
                if (returnIndex == -1) {
                    System.out.println(" is not found in largeArray");
                } else {
                    System.out.printf(" is found in largeArray at location %,d\n", returnIndex);
                }
            }
        }
        System.out.printf("\ntotal nano time for %,d linearSearch: %,.8f seconds\n",
                numSearches, (totalNanoTime / 1000000000.0));

    }

    /**
     * the performMultipleBinarySearch will call the binarySearch multiple times
     * based on the numSearches passed and will display the total nano time for
     * those searches
     *
     * @param arrayToSearch the ArrayCh02 object which manages the array.
     * @param numSearches the number of searches to perform
     */
    public static void performMultipleBinarySearch(RunTimeArray arrayToSearch,
            int numSearches, boolean displaySearchResult) {
        int target;
        int returnIndex;
        long startTime, stopTime, timeDifference;
        long totalNanoTime = 0;

        System.out.printf("\nPerforming %,d Binary Searches: ",numSearches);

        for (int numSearch = 1; numSearch <= numSearches; numSearch++) {
            // note starting time
            startTime = System.nanoTime();

            target = (int) (1 + Math.random() * arrayToSearch.getMaxValueForElement());

            returnIndex = RunTimeSearchingSorting.binarySearch(arrayToSearch.getArray(),
                    arrayToSearch.getArrayLength(), target);

            // note ending time
            stopTime = System.nanoTime();

            // what's the difference?
            timeDifference = stopTime - startTime;

            // accumulate time
            totalNanoTime += timeDifference;

            if (displaySearchResult) {
                System.out.printf("(%,d)", target);
                if (returnIndex == -1) {
                    System.out.println(" is not found in largeArray");
                } else {
                    System.out.printf(" is found in largeArray at location %,d\n", returnIndex);
                }
            }
        }
        System.out.printf("\ntotal nano time for %,d binarySearch: %,.8f seconds\n",
                numSearches, (totalNanoTime / 1000000000.0));

    }

    /**
     * the sortArray method calls the selectionSort static method. the total
     * nano time for the sort is displayed.
     *
     * @param arrayToSort the ArrayCh02 object which manages the array.
     */
    public static void sortArray(RunTimeArray arrayToSort) {
        long startTime, stopTime, timeDifference;

        // note starting time
        startTime = System.nanoTime();

        System.out.printf("\nSorting array of %,d elements:\n", arrayToSort.getArrayLength());

        // sort array
        RunTimeSearchingSorting.selectionSort(arrayToSort.getArray(), arrayToSort.getArrayLength());

        System.out.println("\tsorted. ");

        // note ending time
        stopTime = System.nanoTime();

        // what's the difference?
        timeDifference = stopTime - startTime;

        System.out.printf("\ntotal nano time to sort %,d elements: %,.8f seconds\n",
                arrayToSort.getArrayLength(), (timeDifference / 1000000000.0));
    }    
    
}
