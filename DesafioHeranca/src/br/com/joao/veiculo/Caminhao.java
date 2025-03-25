package br.com.joao.veiculo;

public class Caminhao extends Veiculo{
	
	private double capacidadeDeCargas;

	public Caminhao(String marca, String modelo, int ano, double capacidadeDeCargas) {
		super(marca, modelo, ano);
		this.capacidadeDeCargas = capacidadeDeCargas;
	}

	@Override
	public void exibirInfos() {
		// TODO Auto-generated method stub
		super.exibirInfos();
	}
	
	public void capacidadeDecarga() {
		System.out.println("Capacidade de carga: "+capacidadeDeCargas);
	}

}
