package br.com.hotel2.quartos;

public class Quarto{
	
	protected double precoNoite;
	protected int qtdNoites;
	
	public Quarto( double precoNoite) {
		this.precoNoite = precoNoite;
	}
	
	 public void NumDeNoites(int qtdNoites) {
	        this.qtdNoites = qtdNoites;
	    }

	
	public abstract double precoTotal();
	
	public abstract String servicos();

}
