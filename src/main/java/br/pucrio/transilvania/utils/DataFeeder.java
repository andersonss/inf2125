package br.pucrio.transilvania.utils;

import br.pucrio.transilvania.model.*;

import java.util.*;

public class DataFeeder {

    public static void dataFeed(Hotel hotel) {
        hotel.setClients(insertClients());
        hotel.setRooms(insertRooms());
        hotel.addOccupations(addOccupations());
        hotel.addBookings(addBookings());
    }

    private static List<Client> insertClients() {
        /*
         Código: 101
        Nome: Reginaldo Farias
        Contato: (51) 96186617

        Código: 102
        Nome: Samanta Souza
        Contato: (21) 81534599

        Código: 103
        Nome: Augusto Santos
        Contato: (81) 92097644

        Código: 104
        Nome: Cláudio Silva
        Contato: (48) 99764831

        Código: 105
        Nome: Mariano Santana
        Contato: (11) 94523456
        */

        List<Client> clients = new ArrayList<>();
        clients.add(new Client(101,"Reginaldo Farias","(51) 96186617"));
        clients.add(new Client(102, "Samanta Souza",  "(21) 81534599"));
        clients.add(new Client(103, "Augusto Santos", "(81) 92097644"));
        clients.add(new Client(104, "Claudio Silva", "(48) 99764831"));
        clients.add(new Client(105, "Mariano Santana","(11) 94523456"));

        return clients;
    }


    private static List<Room> insertRooms() {
        /*
        Número: 1
        Tipo: Standard

        Número: 2
        Tipo: Standard

        Número: 3
        Tipo: Apartamento Vista Bosque

        Número: 4
        Tipo: Apartamento Vista Bosque

        Número: 5
        Tipo: Apartamento Vista Bosque

        Número: 6
        Tipo: Apartamento Vista Vale

        Número: 7
        Tipo: Apartamento Vista Vale

        Número: 8
        Tipo: Apartamento Vista Vale

        Número: 9
        Tipo: Suíte

        Número: 10
        Tipo: Suíte
         */
        List<Room> rooms = new ArrayList<>();

        rooms.add(new Room(1, Category.STANDARD));
        rooms.add(new Room(2, Category.STANDARD));
        rooms.add(new Room(3, Category.APARTAMENTO_VISTA_BOSQUE));
        rooms.add(new Room(4, Category.APARTAMENTO_VISTA_BOSQUE));
        rooms.add(new Room(5, Category.APARTAMENTO_VISTA_BOSQUE));
        rooms.add(new Room(6, Category.APARTAMENTO_VISTA_VALE));
        rooms.add(new Room(7, Category.APARTAMENTO_VISTA_VALE));
        rooms.add(new Room(8, Category.APARTAMENTO_VISTA_VALE));
        rooms.add(new Room(9, Category.SUITE));
        rooms.add(new Room(10, Category.SUITE));

        return rooms;
    }

    private static List<Occupation> addOccupations() {
        /*
        Ocupações

        Código do Cliente: 104
        Número do Quarto: 1
        Número de Hóspedes:
        Data de Entrada: data atual
        Data Prevista de Saída: Data Atual + dois dias

        Código do Cliente: 101
        Número do Quarto: 4
        Data de Entrada: data atual ; um dia
        Prevista de Saída: data atual + tres dias
        Número de Hóspedes: 4
        */
        Occupation occupation104 = new Occupation(104, 1, 3,
                Utils.INSTANCE.getTodayDate(), Utils.INSTANCE.sumDaysToCurrentDate(2));

        Occupation occupation101 = new Occupation(101, 4, 4,
                Utils.INSTANCE.sumDaysToCurrentDate(-1), Utils.INSTANCE.sumDaysToCurrentDate(3));

        return Arrays.asList(occupation101, occupation104);
    }

    private static List<Booking> addBookings() {
        /*
        Reserva

        Código do Cliente: 103
        Número do Quarto: 10
        Data de Entrada: data atual + cinco dias
        Data de Saída: data atual + sete dias
        Número de Hóspedes: 2
         */
        Booking booking103 = new Booking(103, 10, 2,
                Utils.INSTANCE.sumDaysToCurrentDate(5), Utils.INSTANCE.sumDaysToCurrentDate(7));

        return Collections.singletonList(booking103);
    }
}
