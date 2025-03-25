package br.com.joao.funcionarios;
import java.util.List;

public class FolhaPagamento extends Funcionario{
	
	

	public FolhaPagamento(String nome, double salariominimo) {
		super(nome, salariominimo);
	}

	public void calcularFolha(List<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionário: " + funcionario.getNome() + " - Salário: R$ " + funcionario.calculoSalario());
        }
        
	}
}

