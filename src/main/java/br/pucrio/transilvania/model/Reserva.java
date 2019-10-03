package br.pucrio.transilvania.model;

import java.util.Date;

public class Reserva {
    private int codigoCliente;
    private  int codQuarto;
    private  int numHospedes;
    private Date dataEntrada;
    private Date dataSaida;
    private boolean fezCheckIn;

    public Reserva(int codigoCliente, int codQuarto, int numHospedes, Date dataEntrada, Date dataSaida, boolean fezCheckIn) {
        this.codigoCliente = codigoCliente;
        this.codQuarto = codQuarto;
        this.numHospedes = numHospedes;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.fezCheckIn = fezCheckIn;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodQuarto() {
        return codQuarto;
    }

    public void setCodQuarto(int codQuarto) {
        this.codQuarto = codQuarto;
    }

    public int getNumHospedes() {
        return numHospedes;
    }

    public void setNumHospedes(int numHospedes) {
        this.numHospedes = numHospedes;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public boolean isFezCheckIn() {
        return fezCheckIn;
    }

    public void setFezCheckIn(boolean fezCheckIn) {
        this.fezCheckIn = fezCheckIn;
    }
}
