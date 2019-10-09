package br.pucrio.transilvania.utils;

import br.pucrio.transilvania.model.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.fest.assertions.Assertions.assertThat;

public class HotelAdministratorTest {

    private Hotel hotel;
    private HotelAdministrator hotelAdministrator;

    @Before
    public void setUp() {
        hotel = new Hotel();
        DataFeeder.dataFeed(hotel);
        hotelAdministrator = new HotelAdministrator(hotel);
    }

    @Test
    public void shouldFindClient() {
        Optional<Client> client = hotelAdministrator.findClient(101);
        assertThat(client.isPresent()).isTrue();
        assertThat(client.get().getCode()).isEqualTo(101);
    }

    @Test
    public void shouldFindClientRoom() {
        Optional<Room> clientRoom1 = hotelAdministrator.findClientRoom(103, 10);
        Optional<Room> clientRoom2 = hotelAdministrator.findClientRoom(104, 1);
        assertThat(clientRoom1.isPresent()).isTrue();
        assertThat(clientRoom1.get().getCategoryType().getCapacity()).isEqualTo(2);
        assertThat(clientRoom2.isPresent()).isTrue();
    }

    @Test
    public void shouldFindClientBooking() {
        Optional<Booking> clientActiveBooking = hotelAdministrator.findClientActiveBooking(103);
        assertThat(clientActiveBooking.isPresent()).isTrue();
    }

    @Test
    public void shouldFindBookingRoom() {
        assertThat(hotelAdministrator.findActiveRoomBooking(10).isPresent()).isTrue();
    }

    @Test
    public void shouldCheckIfRoomIsAvailable() {
        boolean roomAvailable = hotelAdministrator.isRoomAvailable(10, Utils.INSTANCE.sumDaysToCurrentDate(5),
                Utils.INSTANCE.sumDaysToCurrentDate(7));
        assertThat(roomAvailable).isFalse();
        boolean roomAvailable1 = hotelAdministrator.isRoomAvailable(10, Utils.INSTANCE.sumDaysToCurrentDate(10),
                Utils.INSTANCE.sumDaysToCurrentDate(20));
        assertThat(roomAvailable1).isTrue();
    }
 }
