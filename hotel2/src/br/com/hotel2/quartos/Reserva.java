package br.com.hotel2.quartos;

	public class Reserva {
	    private Quarto quarto;

	    public Reserva(Quarto quarto, int qtdNoites) {
	        this.quarto = quarto;
	        this.quarto.NumDeNoites(qtdNoites);
	    }

	  
	    public double calcularTotal() {
	        return quarto.precoTotal();
	    }

	    public void detalhesReserva() {
	        System.out.println("Tipo de quarto: " + quarto.getClass().getSimpleName());
	        System.out.println("Serviços: " + quarto.servicos());
	        System.out.println("Preço total da estadia: " + calcularTotal());
	    }
	}

