package br.pucrio.transilvania.model;

import java.util.Date;

public class Occupation extends Request {

    private float costValue;

    public Occupation(int clientCode, int roomCode, int numberOfOccupants, Date entryDate, Date departureDate) {
        super(clientCode, roomCode, numberOfOccupants, entryDate, departureDate);
    }

    public void setCostValue(float costValue){
        this.costValue = costValue;
    }
}
