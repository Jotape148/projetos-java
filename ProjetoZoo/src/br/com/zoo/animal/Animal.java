package br.com.zoo.animal;

public class Animal {
	
	private String especie;
	private String raca;
	private String habitat;
	private String dieta;
	
	
	public Animal(String especie, String raca, String habitat, String dieta) {
		super();
		this.especie = especie;
		this.raca = raca;
		this.habitat = habitat;
		this.dieta = dieta;
	}
	
	public void exibirInfos () {
		System.out.println("Especie: "+especie);
		System.out.println("Raca: "+raca);
		System.out.println("Habtat: "+habitat);
		System.out.println("Dieta: "+dieta);
		
	}
	
	

}
