package br.com.honda.veiculo;

public class Veiculo {
	
	//atributos da classe
	private String marca;
	private String modelo;
	private String cor;
	
	//construtor da classe ( inicializar os atributos)
	public Veiculo(String marca, String modelo, String cor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}
	
	//metodo
	public void acelerar() {
		
		System.out.println(modelo+" Acelerando");
	}
	
	public void freiar() {
		
		System.out.println(modelo+" freiando");
	}
	
	

}
