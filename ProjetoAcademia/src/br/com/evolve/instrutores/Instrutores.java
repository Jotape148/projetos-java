package br.com.evolve.instrutores;

public class Instrutores {
	
	//atributos (caracteristicas)
	private String nome;
	private int idade;
	private String sexo;
	private String funcao;
	
	//construtor inicializar os atributos da classe
	public Instrutores(String nome, int idade, String sexo, String funcao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.funcao = funcao;
	}
	
	//metodos (acoes)
	public String nome() {
		
		return nome;
		
	}
	
	public int idade() {
		
		return idade;
	}
	
	public String sexo() {
		
		return sexo;
		
	}
	
	public String funcao() {
		
		return funcao;
	}

}
