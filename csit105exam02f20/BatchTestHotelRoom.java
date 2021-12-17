package csit105exam02f20;

/**
 * batch tester for HotelRoom class
 * @author Stephen T. Brower
 */
public class BatchTestHotelRoom {
    
    /**
     * starting point for this tester
     * @param args command line parameters
     */
    public static void main(String[] args) {
        //  *** tests for setters and toString() ***
        // create a test object
        HotelRoom testObject = new HotelRoom("T000A",'S',2);
        
        System.out.println("\n*** Batch Tester for HotelRoom version 1A ***\n");
        
        // display testObject (method uses getters
        displayObject(testObject,   (79.90*2));
        // change testObject using setters
        testObject.setRoomNum("T000B");
        testObject.setStyleOfRoom('D');
        testObject.setNumberOfNights(5);
        // display revised testObject
        displayObject(testObject,   (119.98*5));
        // display object using toString() implicitly
        System.out.println("testOject: " + testObject);

        
        //                                                  /-expected charges
        displayObject(new HotelRoom("T101",'S',1),   (79.90*1)); // 'S' 1 night
        displayObject(new HotelRoom("T102",'D',1),   (119.98*1)); // 'D' 1 night
        displayObject(new HotelRoom("T103",'s',2),   (79.90*2)); // 's' 2 nights
        displayObject(new HotelRoom("T104",'d',2),   (119.98*2)); // 'D' 2 nights
        displayObject(new HotelRoom("T105",'S',3),   (79.90*3)); // 'S' 3 nights
        displayObject(new HotelRoom("T106",'D',3),   (119.98*3)); // 'D' 3 nights
        displayObject(new HotelRoom("T107",'S',4),   (79.90*4)); // 'S' 4 nights
        displayObject(new HotelRoom("T108",'D',4),   (119.98*4)); // 'D' 4 nights
        displayObject(new HotelRoom("T109",'S',5),   (79.90*5)); // 'S' 5 nights
        displayObject(new HotelRoom("T110",'d',5),   (119.98*5)); // 'D' 5 nights
        displayObject(new HotelRoom("T111",'S',7),   (79.90*7)*0.9); // 'S' 7 nights
        displayObject(new HotelRoom("T112",'D',7),   (119.98*7)); // 'D' 7 nights
        displayObject(new HotelRoom("T114",'S',12),   (79.90*12)*0.9); // 'S' 12 nights
        displayObject(new HotelRoom("T115",'D',12),   (119.98*12)); // 'D' 12 nights
        displayObject(new HotelRoom("T113A",'X',3),   (0.00*3)); // 'X' 3 nights
        System.out.println("\n*** Next line deliberately wrong ***");
        displayObject(new HotelRoom("T113B",'S',7),  .99);  // <-- deliberately wrong - placeholder
    }

    /**
     * displayObject method displays a ShippingCharges object using getters and
     * compares to an expected value
     * @param passedObject an instance of ShippingCharges class
     * @param expected a double value for the expected fees
     */
    public static void displayObject(HotelRoom passedObject, double expected)
    {
        // display object using getters
        System.out.printf("Room: %5s Style %s # nights: %3d Expected: %,8.2f Charges: %,8.2f",
                                passedObject.getRoomNum(),
                                passedObject.getStyleOfRoom(),
                                passedObject.getNumberOfNights(),
                                expected,
                                passedObject.currentBill());

        // test to see if value is as expected
        if (  Math.abs(expected - passedObject.currentBill() ) >= 0.01 )
            System.out.println("\t\t<===");
        else
            System.out.println();

    }    
}

/*
Expected Output:

*** Batch Tester for HotelRoom version 1A ***

Room: T000A Style S # nights:   2 Expected:   159.80 Charges:   159.80
Room: T000B Style D # nights:   5 Expected:   599.90 Charges:   599.90
testOject: class HotelRoom room#: T000B type: D # nights 5 current bill: 599.90
Room:  T101 Style S # nights:   1 Expected:    79.90 Charges:    79.90
Room:  T102 Style D # nights:   1 Expected:   119.98 Charges:   119.98
Room:  T103 Style s # nights:   2 Expected:   159.80 Charges:   159.80
Room:  T104 Style d # nights:   2 Expected:   239.96 Charges:   239.96
Room:  T105 Style S # nights:   3 Expected:   239.70 Charges:   239.70
Room:  T106 Style D # nights:   3 Expected:   359.94 Charges:   359.94
Room:  T107 Style S # nights:   4 Expected:   319.60 Charges:   319.60
Room:  T108 Style D # nights:   4 Expected:   479.92 Charges:   479.92
Room:  T109 Style S # nights:   5 Expected:   399.50 Charges:   399.50
Room:  T110 Style d # nights:   5 Expected:   599.90 Charges:   599.90
Room:  T111 Style S # nights:   7 Expected:   503.37 Charges:   503.37
Room:  T112 Style D # nights:   7 Expected:   839.86 Charges:   839.86
Room:  T114 Style S # nights:  12 Expected:   862.92 Charges:   862.92
Room:  T115 Style D # nights:  12 Expected: 1,439.76 Charges: 1,439.76
Room: T113A Style X # nights:   3 Expected:     0.00 Charges:     0.00

*** Next line deliberately wrong ***
Room: T113B Style S # nights:   7 Expected:     0.99 Charges:   503.37		<===
*/

