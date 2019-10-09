package br.pucrio.transilvania.model;

import br.pucrio.transilvania.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Hotel {
    private List<Client> clients;
    private List<Room> rooms;

    public Hotel() {
        this.clients = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void addOccupation(Occupation occupation) {
        rooms.stream().filter(room -> room.getCode() == occupation.getRoomCode()).findFirst()
                .ifPresent(new Consumer<Room>() {
                    @Override
                    public void accept(Room room) {
                        occupation.setCostValue(room.getCategoryType()
                                .getChargePerDay(occupation.getNumberOfOccupants()
                                        == room.getCategoryType().getCapacity() + 1)
                                * Utils.INSTANCE.mumberOfDaysBetweenDates(occupation.getEntryDate(),
                                occupation.getDepartureDate()));
                        room.addOccupation(occupation);
                    }
                });
    }

    public void addOccupations(List<Occupation> occupations) {
        occupations.forEach(this::addOccupation);
    }

    public void addBooking(Booking booking) {
        rooms.stream().filter(room -> room.getCode() == booking.getRoomCode()).findFirst()
                .ifPresent(room -> room.addBooking(booking));
    }

    public void addBookings(List<Booking> bookings) {
        bookings.forEach(this::addBooking);
    }
}
