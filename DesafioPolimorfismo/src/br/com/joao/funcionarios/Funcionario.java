package br.com.joao.funcionarios;


public class Funcionario {
	
	private String nome;
	private double salariominimo;
	
	public Funcionario(String nome, double salariominimo) {
		super();
		this.nome = nome;
		this.salariominimo = salariominimo;
	}
	
	public double calculoSalario() {
		return salariominimo;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalariominimo() {
		return salariominimo;
	}

	public void setSalariominimo(double salariominimo) {
		this.salariominimo = salariominimo;
	}


	
	
	
	

}
