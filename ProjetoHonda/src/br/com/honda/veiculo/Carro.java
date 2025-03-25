package br.com.honda.veiculo;

public class Carro extends Veiculo{
	
	private int tamanhoPortaLuvas;
	private int qtdTapete;
	
	public Carro(String mara, String modelo, String cor, int tamanhoPortaLuvas, int qtdTapete) {
		super(mara, modelo, cor);
		this.tamanhoPortaLuvas = tamanhoPortaLuvas;
		this.qtdTapete = qtdTapete;
	}
	
	public void capota() {
		
		System.out.println("Capotando");
	}
	
	

}
