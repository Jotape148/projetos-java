package br.com.hotel.quartos;

public class Quarto {

	private String tipoCama;

	public Quarto(String tipoCama) {
		super();
		this.tipoCama = tipoCama;
	}
	
	public double calcularValor(int numNoite, double vlrNoite) {
		return numNoite * vlrNoite;
	}
	
	public void infos() {
		System.out.println("Tipo de cama: "+tipoCama);
	}

	public String getTipoCama() {
		return tipoCama;
	}

	public void setTipoCama(String tipoCama) {
		this.tipoCama = tipoCama;
	}
	
}
