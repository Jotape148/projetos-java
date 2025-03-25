package br.com.joao.main;
import br.com.joao.funcionarios.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("João", 2000);
        Gerente gerente = new Gerente("Maria", 3000, 2000);
        Diretor diretor = new Diretor("Carlos", 5000, 5000);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario);
        funcionarios.add(gerente);
        funcionarios.add(diretor);

        FolhaPagamento folhaPagamento = new FolhaPagamento(null, 0);
        folhaPagamento.calcularFolha(funcionarios);
	}

}
