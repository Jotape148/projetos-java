package br.com.hotel.quartos;

public class QuartoLuxo extends Quarto{
	
	private boolean cafeDaManha;
	private boolean frigobar;
	
	public QuartoLuxo(String tipoCama, boolean cafeDaManha, boolean frigobar) {
		super(tipoCama);
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
		if(cafeDaManha) {
			System.out.println("Servico de cafe da manha disponivel");
		}
		if(frigobar) {
			System.out.println("Servico de frigobar disponivel");
		}
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
