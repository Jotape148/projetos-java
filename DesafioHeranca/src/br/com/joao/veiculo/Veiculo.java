package br.com.joao.veiculo;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private int ano;
	
	public Veiculo(String marca, String modelo, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public void exibirInfos() {
		System.out.println("Marca : "+ marca);
		System.out.println("Modelo : "+ modelo);
		System.out.println("Ano : "+ ano);
	}
}
