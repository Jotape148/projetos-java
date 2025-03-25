package br.com.hotel2.main;

import br.com.hotel2.quartos.*;


public class Main {
    public static void main(String[] args) {
        Quarto quartoSimples = new QuartoSimples();
        Reserva reservaSimples = new Reserva(quartoSimples, 3); 
        reservaSimples.detalhesReserva();
        
        Quarto quartoLuxo = new QuartoLuxo();
        Reserva reservaLuxo = new Reserva(quartoLuxo, 5);
        
        Quarto suitePresidencial = new SuitePresidencial();
        Reserva reservaSuite = new Reserva(suitePresidencial, 2);
        reservaSuite.detalhesReserva();
    }
}