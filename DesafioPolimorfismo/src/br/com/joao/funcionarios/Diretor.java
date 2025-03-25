package br.com.joao.funcionarios;

public class Diretor extends Funcionario {
	
	private double lucros;

	public Diretor(String nome, double salariominimo, double lucros) {
		super(nome, salariominimo);
		this.lucros = lucros;
	}

	@Override
	public double calculoSalario() {
		return getSalariominimo() + lucros;
	}
	
	
	
	
	
	

}
