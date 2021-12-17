package csit105exam02f20;

/**
 * Algonquin Hotel
 *
 * @author Stephen T. Brower
 */
public class HotelRoom {

    private String roomNum;
    private char styleOfRoom;
    private int numberOfNights;

    /**
     * Constructor
     *
     * @param initialRoomNum value for roomNum field
     * @param initialStyleOfRoom value for the styleOfRoom field
     * @param initialNumberOfNights value for the numberOfNights field
     */
    public HotelRoom(String initialRoomNum, char initialStyleOfRoom, int initialNumberOfNights) {
        roomNum = initialRoomNum;
        styleOfRoom = initialStyleOfRoom;
        numberOfNights = initialNumberOfNights;
    }

    /**
     * getStyleOfRoom method returns the value from the styleOfRoom field
     *
     * @return value from the styleOfRoom field
     */
    public char getStyleOfRoom() {
        return styleOfRoom;
    }

    /**
     * setStyleOfRoom assigns a new new for the styleOfRoom field
     *
     * @param newStyleOfRoom new value for the styleOfRoom field
     */
    public void setStyleOfRoom(char newStyleOfRoom) {
        styleOfRoom = newStyleOfRoom;
    }

    /**
     * getNumberOfNights returns the value from the numberOfNights field
     *
     * @return value from the numberOfNights field
     */
    public int getNumberOfNights() {
        return numberOfNights;
    }

    /**
     * setNumberOfNights assigns a new value for the numberOfNights field
     *
     * @param newNumberOfNights new value for the numberOfNights field
     */
    public void setNumberOfNights(int newNumberOfNights) {
        numberOfNights = newNumberOfNights;
    }

    /**
     * getRoomNum returns the value from the roomNum field
     *
     * @return the value from the roomNum field
     */
    public String getRoomNum() {
        return roomNum;
    }

    /**
     * setRoomNum assigns a new the value for the roomNum field
     *
     * @param roomNum new the value for the roomNum field
     */
    public void setRoomNum(String newRoomNum) {
        roomNum = newRoomNum;
    }

    /**
     * toString returns a textual representation of this object
     *
     * @return a textual representation of this object
     */
    @Override
    public String toString() {
        return this.getClass() + " room#: " + roomNum + " type: " + styleOfRoom + " # nights " + numberOfNights
                + " current bill: " + String.format("%,.2f", currentBill());
    }

    /**
     * currentBill returns the calculated bill based on styleOfRoom and
     * numberOfNights. Modified by: ???
     *
     * @return calculated bill based on styleOfRoom and numberOfNights
     */
    public double currentBill() {
        double valueToReturn;
        final double D_ROOM_RATE = 119.98; // double room rate
        final double S_ROOM_RATE = 79.90; // single room rate
        if (styleOfRoom == 'S' || styleOfRoom == 's') {
            //valueToReturn = 79.90 * numberOfNights;
            if (numberOfNights >= 7) {
                valueToReturn = ((79.90 * numberOfNights)*0.9);
            } else {
                valueToReturn = 79.90 * numberOfNights;
            }
        } else if (styleOfRoom == 'D' || styleOfRoom == 'd') {

            valueToReturn = 119.98 * numberOfNights;
        } else {

            valueToReturn = 0.0;
        }
        return valueToReturn;
    }

}
