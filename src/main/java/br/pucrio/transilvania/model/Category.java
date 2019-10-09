package br.pucrio.transilvania.model;

public enum Category {
    STANDARD(268.0f, 2),
    APARTAMENTO_VISTA_BOSQUE(315.0f, 4),
    APARTAMENTO_VISTA_VALE(353.0f, 4),
    SUITE(498.0f, 2);

    private final float chargePerDay;
    private final int capacity;

    private Category(float chargePerDay, int capacity) {
        this.chargePerDay = chargePerDay;
        this.capacity = capacity;
    }

    public float getChargePerDay(boolean hasSurplusGuest) {
        return (hasSurplusGuest) ? (float) (chargePerDay * 0.3) : chargePerDay;
    }

    public int getCapacity() {
        return capacity;
    }
}
