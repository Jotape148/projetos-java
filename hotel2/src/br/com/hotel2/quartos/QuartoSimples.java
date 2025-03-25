package br.com.hotel2.quartos;

public class QuartoSimples extends Quarto{
	
	public QuartoSimples() {
		super(100.0);
	}
	
	public double precoTotal() {
        return qtdNoites * precoNoite;
    }

    public String Servicos() {
        return "Serviços: Wi-Fi básico.";
    }
}

