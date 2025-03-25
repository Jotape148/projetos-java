package br.com.hotel.main;

import br.com.hotel.quartos.*;

public class Main {
    public static void main(String[] args) {
        Quartos quartoSimples = new QuartoSimples();
        Reserva reservaSimples = new Reserva(quartoSimples, 3);
        reservaSimples.detalhesReserva();
        System.out.println("----------------------------------------------------------");
        
        Quartos quartoLuxo = new QuartoLuxo();
        Reserva reservaLuxo = new Reserva(quartoLuxo, 5);
        reservaLuxo.detalhesReserva();
        System.out.println("----------------------------------------------------------");
        
        Quartos suitePresidencial = new SuitePresendencial();
        Reserva reservaSuite = new Reserva(suitePresidencial, 2); 
        reservaSuite.detalhesReserva();
        System.out.println("----------------------------------------------------------");
    }
}

