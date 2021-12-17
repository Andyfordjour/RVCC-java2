package csit105demochapter10f20;

import java.io.*;

/**
 * This program opens a binary file, then reads and displays the contents.
 *
 * @author Tony Gaddis (et al)
 */
public class ReadBinaryFile {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int number;                // To hold a number
        boolean endOfFile = false; // End of file flag

        try {
            // Open Numbers.dat as a binary file.
            FileInputStream fstream
                    = new FileInputStream("Numbers.dat");
            DataInputStream inputFile
                    = new DataInputStream(fstream);

            System.out.println("Reading numbers from the file:");

            // Read data from the file.
            while (!endOfFile) {
                try {
                    number = inputFile.readInt();
                    System.out.print(number + " ");
                } catch (EOFException e) {
                    endOfFile = true;
                }
            }

            // Close the file.
            inputFile.close();
            System.out.println("\nDone.");
        } catch (FileNotFoundException e) {
            // If the file was not found, the following
            // statement will execute.
            System.out.println("Numbers.DAT file not found....try running WriteBinaryFile.java first!");
        }

    }
}
