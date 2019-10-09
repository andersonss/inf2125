package br.pucrio.transilvania.model;

import br.pucrio.transilvania.utils.Utils;

import java.util.Date;

public class Booking extends Request {

    private boolean didCheckIn;
    private boolean isActive;

    public Booking(int clientCode, int roomCode, int numberOfOccupants, Date entryDate, Date departureDate) {
        super(clientCode, roomCode, numberOfOccupants, entryDate, departureDate);
        this.isActive = Utils.INSTANCE.getTodayDate().getTime() <= entryDate.getTime();
    }

    public boolean isDidCheckIn() {
        return didCheckIn;
    }

    public void setDidCheckIn(boolean didCheckIn) {
        this.didCheckIn = didCheckIn;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
