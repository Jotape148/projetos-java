package br.com.hotel.quartos;

public class QuartoSimples extends Quartos {
    
    public QuartoSimples() {
        super(100.0);
    }

    public double calcularPrecoTotal() {
        return qtdNoites * precoPorNoite;
    }

    public String Servicos() {
        return "Serviços: Wi-Fi básico.";
    }
}

