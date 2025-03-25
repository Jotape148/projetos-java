package br.com.joao.banco;

public class ContaBancaria {
	
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		if ( valor > 0 ) {
			saldo += valor;
			System.out.println("valor de : "+ valor +" depositado com sucesso");
		}else {
			System.out.println("Ocorreu um erro");
		}
	}
	
	 public void sacar(double valor) {
	        if (valor > 0 && valor <= saldo) {
	            saldo -= valor;
	            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
	        } else {
	            System.out.println("Saque não permitido. Verifique o valor e o saldo disponível.");
	        }
	    }
	
	public double verSaldo() {
		return saldo;
	}
	
	public void alterarTitular(String novoTitular) {
        if (novoTitular != null && !novoTitular.isEmpty()) {
            titular = novoTitular;
            System.out.println("Titular alterado com sucesso para: " + novoTitular);
        } else {
            System.out.println("Nome do titular inválido!");
        }
    }
	
	public String verTitular() {
		return titular;
	}
	
	

}
