package csit105demochapter10f20;

import java.io.*;

/**
 * This program deserializes the objects in the Objects.dat file and stores them
 * in an array.
 *
 * @author Tony Gaddis (et al)
 */
public class DeserializeObjects {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        final int NUM_ITEMS = 3;  // Number of items

        try {
            // Create the stream objects.
            FileInputStream inStream
                    = new FileInputStream("Objects.dat");
            ObjectInputStream objectInputFile
                    = new ObjectInputStream(inStream);

            // Create an array to hold InventoryItem objects.
            InventoryItem2[] items = new InventoryItem2[NUM_ITEMS];

            // Read the serialized objects from the file.
            for (int i = 0; i < items.length; i++) {
                items[i]
                        = (InventoryItem2) objectInputFile.readObject();
            }

            // Close the file.
            objectInputFile.close();

            // Display the objects.
            for (int i = 0; i < items.length; i++) {
                System.out.println("Item " + (i + 1));
                System.out.println("   Description: "
                        + items[i].getDescription());
                System.out.println("   Units: "
                        + items[i].getUnits());
            }
        } catch (FileNotFoundException e) {
            // If the file was not found, the following
            // statement will execute.
            System.out.println("Objects.dat file not found - run SerializeObjects first.");
        }
    }
}
