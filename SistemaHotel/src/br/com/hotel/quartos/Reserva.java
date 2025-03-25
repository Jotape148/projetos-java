package br.com.hotel.quartos;

public class Reserva {
    private Quartos quarto;

    public Reserva(Quartos quarto, int qtdNoites) {
        this.quarto = quarto;
        this.quarto.setNumeroDeNoites(qtdNoites);
    }

    public double calcularTotal() {
        return quarto.calcularPrecoTotal();
    }

    public void detalhesReserva() {
        System.out.println("Tipo de quarto: " + quarto.getClass().getSimpleName());
        System.out.println("Serviços: " + quarto.Servicos());
        System.out.println("Preço total da estadia: " + calcularTotal());
    }
}
