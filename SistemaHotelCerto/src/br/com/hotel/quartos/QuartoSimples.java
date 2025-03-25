package br.com.hotel.quartos;

public class QuartoSimples extends Quarto{
	
	private boolean frigobar;

	public QuartoSimples(String tipoCama, boolean frigobar) {
		super(tipoCama);
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
		if(frigobar) {
			System.out.println("Servicos de frigoabr disponiveis");
		}
	}

	public boolean isFrigobar() {
		return frigobar;
	}

	public void setFrigobar(boolean frigobar) {
		this.frigobar = frigobar;
	}

}
