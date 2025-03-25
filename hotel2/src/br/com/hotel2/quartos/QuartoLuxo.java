package br.com.hotel2.quartos;

public class QuartoLuxo extends Quarto{
	
	public QuartoLuxo() {
		super(300.0);
	}
	
	public double precoTotal() {
        return qtdNoites * precoNoite;
    }

    public String Servicos() {
        return "Serviços: Wi-Fi e cafe da manha.";
    }

}
