package room.reservation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private List<Guest> guestList = new ArrayList<>();
    private Room room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private boolean isBusinessTrip;

    // region Constructors
    public Booking(Guest guest, Room room,  LocalDate checkInDate, LocalDate checkOutDate, boolean isBusinessTrip) {
        this.guestList.add(guest);
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.isBusinessTrip = isBusinessTrip;
    }

    public Booking(Guest guest, Room room, LocalDate checkInDate, LocalDate checkOutDate) {
        this(guest, room, checkInDate, checkOutDate, false);
    }
    // endregion

    // region Getters and setters
    public List<Guest> getGuestList() {
        return guestList;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public boolean isBusinessTrip() {
        return isBusinessTrip;
    }

    public void setBusinessTrip(boolean businessTrip) {
        isBusinessTrip = businessTrip;
    }

    public void addGuest(Guest guest) {
        this.guestList.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.guestList.remove(guest);
    }
    // endregion
}
