package br.com.joao.main;

import br.com.joao.banco.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaBancaria conta = new ContaBancaria("Joao", 1000);
		
		 System.out.println("Titular da conta: " + conta.verTitular());
	     System.out.println("Saldo inicial: R$ " + conta.verSaldo());
	     
	     conta.depositar(200);
	     System.out.println("Saldo atual: R$ " + conta.verSaldo());
	     
	     conta.sacar(230);
	     System.out.println("Saldo atual: R$ " + conta.verSaldo());
	     
	     conta.alterarTitular("julio");
	     System.out.println("Novo titular da conta: " + conta.verTitular());
	}

}
