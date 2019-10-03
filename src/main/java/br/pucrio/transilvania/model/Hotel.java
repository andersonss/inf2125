package br.pucrio.transilvania.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Cliente> clientes;
    private List<Quarto> quartos;
    private List<Reserva> reservas;

    public Hotel() {
        this.clientes = new ArrayList();
        this.quartos = new ArrayList();
        this.reservas = new ArrayList();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
