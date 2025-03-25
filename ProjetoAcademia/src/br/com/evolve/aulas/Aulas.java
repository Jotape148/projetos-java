package br.com.evolve.aulas;

public class Aulas {
	
	//atributos
	private String modalidade;
	private String horario;
	private String professor;
	
	
	//construtor inicializar os atributos da classe
	public Aulas(String modalidade, String horario, String professor) {
		super();
		this.modalidade = modalidade;
		this.horario = horario;
		this.professor = professor;
	}
	
	//metodos (acoes)
	public String modalidade() {
		
		return modalidade;
	}
	
	public String horario() {
		
		return horario;
	}
	
	public String professor() {
		
		return professor;
	}
	
	
	

}
