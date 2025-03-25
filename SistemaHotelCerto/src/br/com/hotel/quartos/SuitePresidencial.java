package br.com.hotel.quartos;

public class SuitePresidencial extends Quarto{
	
	private boolean spa;
	private boolean cafeDaManha;
	private boolean frigobar;
	
	public SuitePresidencial(String tipoCama, boolean spa, boolean cafeDaManha, boolean frigobar) {
		super(tipoCama);
		this.spa = spa;
		this.cafeDaManha = cafeDaManha;
		this.frigobar = frigobar;
	}

	@Override
	public double calcularValor(int numNoite, double vlrNoite) {
		// TODO Auto-generated method stub
		return super.calcularValor(numNoite, vlrNoite);
	}

	@Override
	public void infos() {
		// TODO Auto-generated method stub
		super.infos();
		if(spa) {
			System.out.println("Servico de spa disponivel");
		}
		if(cafeDaManha) {
			System.out.println("Servico de cafe da manha disponivel");
		}
		if(frigobar) {
			System.out.println("Servico de frigobar disponivel");
		}
	}

	public boolean isSpa() {
		return spa;
	}

	public void setSpa(boolean spa) {
		this.spa = spa;
	}

	public boolean isCafeDaManha() {
		return cafeDaManha;
	}

	public void setCafeDaManha(boolean cafeDaManha) {
		this.cafeDaManha = cafeDaManha;
	}

	public boolean isFrigobar() {
		return frigobar;
	}

	public void setFrigobar(boolean frigobar) {
		this.frigobar = frigobar;
	}
}
