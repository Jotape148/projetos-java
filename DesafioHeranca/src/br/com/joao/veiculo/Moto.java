package br.com.joao.veiculo;

public class Moto extends Veiculo{
	
	private boolean automatica;

	public Moto(String marca, String modelo, int ano, boolean automatica) {
		super(marca, modelo, ano);
		this.automatica = automatica;
	}

	@Override
	public void exibirInfos() {
		// TODO Auto-generated method stub
		super.exibirInfos();
	}
	
	
	
	public void automatico() {
		System.out.println("Automatica");
	}

}
