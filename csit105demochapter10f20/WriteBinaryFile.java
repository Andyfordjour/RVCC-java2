package csit105demochapter10f20;

import java.io.*;

/**
 * This program opens a binary file and writes the contents of an int array to
 * the file.
 *
 * @author Tony Gaddis (et al)
 */
public class WriteBinaryFile {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */

    public static void main(String[] args) throws IOException {
        // Create an array of integers.
        int[] numbers = {8, 6, 7, 5, 3, 0, 9};

        // Open a binary file for output.
        FileOutputStream fstream
                = new FileOutputStream("Numbers.dat");
        DataOutputStream outputFile
                = new DataOutputStream(fstream);

        System.out.println("Writing to the file...");

        // Write the array elements to the binary file.
        for (int i = 0; i < numbers.length; i++) {
            outputFile.writeInt(numbers[i]);
        }

        // Close the file.
        outputFile.close();
        System.out.println("Done.");
    }
}
