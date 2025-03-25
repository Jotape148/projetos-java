package br.com.joao.veiculo;

public class Carro extends Veiculo{
	
	private int qtdPortas;

	public Carro(String marca, String modelo, int ano, int qtdPortas) {
		super(marca, modelo, ano);
		this.qtdPortas = qtdPortas;
	}
	
	@Override
	public void exibirInfos() {
		// TODO Auto-generated method stub
		super.exibirInfos();
	}

	public void portas() {
		System.out.println("Quantidade de portas : " + qtdPortas);
	}

}
