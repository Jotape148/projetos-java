package br.com.hotel.quartos;

public class QuartoLuxo extends Quartos {

    public QuartoLuxo() {
        super(200.0);
    }

    public double calcularPrecoTotal() {
        return qtdNoites * precoPorNoite;
    }

    public String Servicos() {
        return "Serviços: Wi-Fi, Café da manhã incluso.";
    }
}
