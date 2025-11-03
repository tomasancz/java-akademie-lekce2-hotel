import cz.engeto.roomreservation.Booking;
import cz.engeto.roomreservation.Guest;
import cz.engeto.roomreservation.Room;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Booking> bookingList = new ArrayList<>();

        // region hosté [Domácí úkol - lekce 2: Testovací aplikace]
        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořák", LocalDate.of(1995, 5, 5));
        guest2.setBirthdate(LocalDate.of(1995,4,5));
        System.out.println(guest2.getName() + " " + guest2.getSurname() + " (" + guest2.getBirthdate() + ")\n");
        // endregion

        // region pokoje [Domácí úkol - lekce 2: Přidej pokoje]
        Room room1 = new Room(1, new BigDecimal("1000"), 1, true, true);
        Room room2 = new Room(2, new BigDecimal("1000"), 1, true, true);
        Room room3 = new Room(3, new BigDecimal("2400"), 3, false, true);
        // endregion

        //region rezervace [Domácí úkol - lekce 2: Připrav rezervace]
        bookingList.add(new Booking(guest1,room1, LocalDate.of(2021,7,1), LocalDate.of(2021,7,26) ));
        // Booking booking1 = new Booking(guest1,room1, LocalDate.of(2021,7,1), LocalDate.of(2021,7,26) );
        bookingList.add(new Booking(guest1,room3, LocalDate.of(2021,9,3), LocalDate.of(2021,9,14) ));
        //Booking booking2 = new Booking(guest1,room3, LocalDate.of(2021,9,3), LocalDate.of(2021,9,14) );
        bookingList.getLast().addGuest(guest2);
        //endregion

        //region výpis rezervaci [Domácí úkol - lekce 2: Seznam rezervací]
        DateTimeFormatter czechFormat = DateTimeFormatter.ofPattern("d.MM.yyyy");
        System.out.println("Seznam rezervací:");
        for (Booking booking : bookingList) {
            System.out.println("Rezervace pro pokoj č." + booking.getRoom().getRoomNumber());
            System.out.println("Datum: " + booking.getCheckInDate().format(czechFormat) + " - " + booking.getCheckOutDate().format(czechFormat) + ", ");
            System.out.print("Hosté: ");
            for(Guest guest : booking.getGuestList()) {
                System.out.print(guest.getName() + " " + guest.getSurname() + ", ");
            }
            System.out.println("\nCena: " + booking.getRoom().getPrice() + " Kč\n");

        }
        //endregion
    }
    //endregion
}
