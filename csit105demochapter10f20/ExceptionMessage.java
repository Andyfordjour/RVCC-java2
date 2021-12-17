package csit105demochapter10f20;

import java.io.*; // For File class and FileNotFoundException
import java.util.Scanner; // For the Scanner class

/**
 * This program demonstrates how the default error message can be retrieved from
 * an exception object.
 *
 * @author Tony Gaddis (et al)
 */
public class ExceptionMessage {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // a file that exists:         
        // String fileName = "SalesData.txt";

        // a file that does not exists:  
        String fileName = "blahblah_not_here.blah";
        String lineRead;

        // Attempt to open the file.
        try {
            // Create a File object representing the file.
            File file = new File(fileName);

            // Create a Scanner object to read the file.
            // If the file does not exist, the following
            // statement will throw a FileNotFoundException.
            Scanner inputFile = new Scanner(file);

            // If the file was successfully opened, the
            // following statement will execute.
            System.out.println(fileName + " file was found.");
            // do stuff with file here

            while (inputFile.hasNext()) {
                lineRead = inputFile.nextLine();

                System.out.println("line read: " + lineRead);
            }

            // close file
            inputFile.close();
        } catch (FileNotFoundException e) {
            // If the file was not found, the following
            // statement will execute. It displays the
            // default error message.
            System.out.println("< " + e.getMessage() + " >");
        }

        System.out.println("Done.");
    }
}
