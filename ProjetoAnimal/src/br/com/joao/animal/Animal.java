package br.com.joao.animal;

public class Animal {
	
	private String especie;
	private String raca;
	
	
	public Animal(String especie, String raca) {
		super();
		this.especie = especie;
		this.raca = raca;
	}
	
	public void emitirSom(String tipoSom) {
		
		System.out.println(especie+ "Emitindo "+tipoSom);
	}

}
