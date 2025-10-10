package booking;

import java.math.BigDecimal;

public class Room {
    private int roomNumber;
    private int numOfBeds;
    private boolean hasBalcony;
    private boolean hasSeaView;
    double price;   // price in euro

    public Room (int roomNumber, int numOfBeds, boolean hasBalcony, boolean hasSeaView, double price) {
        this.roomNumber = roomNumber;
        this.numOfBeds = numOfBeds;
        this.hasBalcony = hasBalcony;
        this.hasSeaView = hasSeaView;
        this.price = price;
    }

    public Room (int roomNumber, int price) {
        this(roomNumber, 2, false, false, price);
    }

}
