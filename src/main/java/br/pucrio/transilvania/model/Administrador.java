package br.pucrio.transilvania.model;

import java.util.Optional;

public class Administrador {

    private Hotel hotel;

    public void fazerCheckIn(int codigoCliente, int codigoQuarto, String dataEntrada, String dataSaida) {

    }

    public void fazerCheckOut() {

    }

    public void reservarQuarto(int codigoCliente, int codigoQuarto, String dataEntrada, String dataSaida) {

    }

    public Cliente consultarCliente(int codigoCliente) {
        for (Cliente cliente : hotel.getClientes()) {
           if (cliente.getCodigo() == codigoCliente) {
             return cliente;
           }
       }
       return  null;
    }

    public void consultarQuarto() {

    }

    public void gerarRelatorio() {

    }
}
