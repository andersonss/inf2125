package br.pucrio.transilvania.start;

import br.pucrio.transilvania.model.Cliente;
import br.pucrio.transilvania.model.Hotel;
import br.pucrio.transilvania.model.Reserva;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void run() {
        Hotel transilvania = new Hotel();

        List<Cliente> clientes = new ArrayList();
        clientes.add(new Cliente(101,"Reginaldo Farias","(51) 96186617"));
        clientes.add(new Cliente(102, "Samanta Souza",  "(21) 81534599"));
        clientes.add(new Cliente(103, "Augusto Santos", "(81) 92097644"));
        clientes.add(new Cliente(104, "Claudio Silva", "(48) 99764831"));
        clientes.add(new Cliente(105, "Mariano Santana","(11) 94523456"));

        transilvania.setClientes(clientes);

    }
}

