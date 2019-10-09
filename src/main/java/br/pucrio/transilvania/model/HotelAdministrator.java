package br.pucrio.transilvania.model;

import java.util.Date;
import java.util.Optional;
import java.util.stream.Collectors;

public class HotelAdministrator {

    private Hotel hotel;

    private HotelAdministrator() {
    }

    public HotelAdministrator(Hotel hotel) {
        this.hotel = hotel;
    }

    public void checkIn(Request clientRequest) {
        Optional<Booking> clientActiveBooking = findClientActiveBooking(clientRequest.getClientCode());
        //TODO checar se o quarto esta disponivel
        //isRoomAvailable(clientRequest.getRoomCode(), )
        //TODO periodo de permanenciar no hotel deve ser de pelo menos 1 dia
        //TODO verificar se periodo de permanencia nao tem conflito
        //TODO checar quantidade de hospedes
        if (clientActiveBooking.isPresent() && clientActiveBooking.get().getRoomCode() == clientRequest.getRoomCode()) {
            //TODO tem booking
        }
        else {

        }
    }

    public void checkOut() {
        //TODO
    }

    public Optional<Client> findClient(int clientCode) {
        return hotel.getClients().stream().filter(client -> client.getCode() == clientCode).findFirst();
    }

    public Optional<Room> findClientRoom(int clientCode, int roomCode) {
        return hotel.getRooms().stream().filter(room -> (room.getCode() == roomCode)).collect(Collectors.toList()).
                stream().filter(room -> (room.getClientCode() == clientCode) || (room.getClientCode() == 0))
                .findFirst();
    }

    public Optional<Booking> findClientActiveBooking(int clientCode) {
        //hotel.getRooms().stream().filter(room -> room.getBookings().stream()
        //        .anyMatch(booking -> booking.getClientCode() == clientCode && booking.isActive())).findFirst();
        for (Room room : hotel.getRooms()) {
            for (Booking booking : room.getBookings()) {
                if (booking.getClientCode() == clientCode
                        && booking.isActive()) {
                    return Optional.of(booking);
                }
            }

        }
        return Optional.empty();
    }

    public Optional<Booking> findActiveRoomBooking(int roomCode) {
        for (Room room : hotel.getRooms()) {
            for (Booking booking : room.getBookings()) {
                if (booking.getRoomCode() == roomCode
                        && booking.isActive()) {
                    return Optional.of(booking);
                }
            }

        }
        return Optional.empty();
    }

    public boolean isRoomAvailable(int roomCode, Date entryDate, Date departureDate) {
        return isRoomBooked(roomCode, entryDate, departureDate)
                && isRoomBooked(roomCode, entryDate, departureDate);
    }

    public boolean isRoomOccupied(int roomCode, Date entryDate, Date departureDate) {
        for (Room room : hotel.getRooms()) {
            for (Occupation occupation : room.getOccupations()) {
                if (occupation.getRoomCode() == roomCode) {
                    return !(occupation.getEntryDate().getTime() <= departureDate.getTime()
                            && entryDate.getTime() <= occupation.getDepartureDate().getTime());
                }
            }

        }
        return false;
    }

    public boolean isRoomBooked(int roomCode, Date entryDate, Date departureDate) {
        Optional<Booking> roomBooking = findActiveRoomBooking(roomCode);
        if (roomBooking.isPresent() && roomBooking.get().isActive()) {
            return !(roomBooking.get().getEntryDate().getTime() <= departureDate.getTime()
                    && entryDate.getTime() <= roomBooking.get().getDepartureDate().getTime());
        }
        return false;
    }

    private boolean doesRoomHasCapacity(int roomCode, int numberOfHosts) {
        for (Room room : hotel.getRooms()) {
            if (room.getCode() == roomCode) {
                if (numberOfHosts <= room.getCategoryType().getCapacity() + 1) {
                    return true;
                }
            }
        }
        return false;
    }
}