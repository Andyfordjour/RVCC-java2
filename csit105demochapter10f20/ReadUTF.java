package csit105demochapter10f20;

import java.io.*;

/**
 * This program reads UTF-8 encoded strings from a binary file.
 *
 * @author Tony Gaddis (et al)
 */
public class ReadUTF {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */

    public static void main(String[] args) throws IOException {
        String name;
        boolean endOfFile = false;
        try {
            FileInputStream fstream = new FileInputStream("UTFnames.dat");
            DataInputStream inputFile = new DataInputStream(fstream);

            System.out.println("Reading the names from the file:");
            while (!endOfFile) {
                try {
                    name = inputFile.readUTF();
                    System.out.print(name + " ");
                } catch (EOFException e) {
                    endOfFile = true;
                }
            }

            System.out.println("\nDone.");
            inputFile.close();
        } catch (FileNotFoundException e) {
            // If the file was not found, the following
            // statement will execute.
            System.out.println("UTFnames.DAT file not found....try running WriteUTF.java first!");
        }
    }
}
