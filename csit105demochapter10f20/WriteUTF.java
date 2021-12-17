package csit105demochapter10f20;

import java.io.*;

/**
 * This program opens a binary file and writes a series of strings using UTF-8
 * encoding.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class WriteUTF {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */

    public static void main(String[] args) throws IOException {
        String names[] = {"Homer", "Lenny", "Carl", "Krusty"};
        FileOutputStream fstream = new FileOutputStream("UTFnames.dat");
        DataOutputStream outputFile = new DataOutputStream(fstream);

        System.out.println("Writing the names to the file...");

        for (int i = 0; i < names.length; i++) {
            outputFile.writeUTF(names[i]);
        }

        System.out.println("Done.");
        outputFile.close();
    }
}
