package br.com.zoo.animal;

public class Mamifero extends Animal{

	private String temPelos;
	private String temPresas;

	public Mamifero(String especie, String raca, String habitat,String dieta, String temPelos, String temPresas) {
		super(especie, raca, habitat, dieta);
		this.temPelos = temPelos;
		this.temPresas = temPresas;
	}
	
	public void temPelos() {
		System.out.println("O animal tem pelos? "+ temPelos);
	}
	
	public void temPresas() {
		System.out.println("O animal tem presas? "+temPresas);
	}
	
	 public void fazerSom() {
		 System.out.println("Som do animal");
	}
}
