package br.com.joao.funcionarios;

public class Gerente extends Funcionario{
	
	private double acrescimo;

	public Gerente(String nome, double salariominimo, double acrescimo) {
		super(nome, salariominimo);
		this.acrescimo = acrescimo;
	}

	@Override
    public double calculoSalario() {
        return getSalariominimo() + acrescimo;
    }
	
	

}
