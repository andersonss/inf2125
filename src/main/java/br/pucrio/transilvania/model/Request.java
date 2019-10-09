package br.pucrio.transilvania.model;

import java.util.Date;

public class Request {
    private int clientCode;
    private  int roomCode;
    private  int numberOfOccupants;
    private Date entryDate;
    private Date departureDate;


    public Request(int clientCode, int roomCode, int numberOfOccupants, Date entryDate, Date departureDate) {
        this.clientCode = clientCode;
        this.roomCode = roomCode;
        this.numberOfOccupants = numberOfOccupants;
        this.entryDate = entryDate;
        this.departureDate = departureDate;
    }

    public int getClientCode() {
        return clientCode;
    }

    public void setClientCode(int clientCode) {
        this.clientCode = clientCode;
    }

    public int getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(int roomCode) {
        this.roomCode = roomCode;
    }

    public int getNumberOfOccupants() {
        return numberOfOccupants;
    }

    public void setNumberOfOccupants(int numberOfOccupants) {
        this.numberOfOccupants = numberOfOccupants;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

}
