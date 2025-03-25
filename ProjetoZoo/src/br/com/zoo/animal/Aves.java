package br.com.zoo.animal;

public class Aves extends Animal{
	
	private String corPenas;
	private String tamanhoBico;
	

	public Aves(String especie, String raca, String habitat,String dieta, String corPenas, String tamanhoBico) {
		super(especie, raca, habitat, dieta);
		this.corPenas = corPenas;
		this.tamanhoBico = tamanhoBico;
	}
	
	public void corPena() {
        System.out.println("Cor das penas: " + corPenas);  
    }
	
	public void tamanhoBico() {
		System.out.println("Tamanho do bico : "+ tamanhoBico);
	}
	
	public void fazerSom() {
        System.out.println("Canto");
    }
	

}
