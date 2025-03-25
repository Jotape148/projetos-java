package br.com.hotel.quartos;

public class SuitePresendencial extends Quartos {

    public SuitePresendencial() {
        super(500.0);
    }

    public double calcularPrecoTotal() {
        return qtdNoites * precoPorNoite;
    }

    public String Servicos() {
        return "Serviços: Wi-Fi, Café da manhã, Acesso ao Spa.";
    }
}
