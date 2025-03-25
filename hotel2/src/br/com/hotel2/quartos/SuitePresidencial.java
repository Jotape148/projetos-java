package br.com.hotel2.quartos;

public class SuitePresidencial extends Quarto{
	
	public SuitePresidencial() {
		super(700.0);
	}
	
	public double precoTotal() {
        return precoNoite * qtdNoites;
    }

    public String Servicos() {
        return "Serviços: Wi-Fi e cafe da manha e acesso ao spa.";
    }

}

