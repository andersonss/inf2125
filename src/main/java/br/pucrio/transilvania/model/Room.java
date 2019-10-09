package br.pucrio.transilvania.model;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int code;
    private Category categoryType;
    private int clientCode;
    private List<Occupation> occupations;
    private List<Booking> bookings;

    public Room(int code, Category categoryType) {
        this.code = code;
        this.categoryType = categoryType;
        this.occupations = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Category getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Category categoryType) {
        this.categoryType = categoryType;
    }

    public int getClientCode() {
        return clientCode;
    }

    public void setClientCode(int clientCode) {
        this.clientCode = clientCode;
    }

    public List<Occupation> getOccupations() {
        return occupations;
    }

    public void setOccupations(List<Occupation> occupations) {
        this.occupations = occupations;
    }

    public void addOccupation(Occupation occupation) {
        this.occupations.add(occupation);
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
