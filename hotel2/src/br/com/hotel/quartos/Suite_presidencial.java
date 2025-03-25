package br.com.hotel.quartos;

public class Suite_presidencial extends Quarto{
	
	private int preco_presidencial = 1200;

	public Suite_presidencial(int numero_quarto, int andar, String bloco, int qtd_noite, String servicos,
			int preco_presidencial) {
		super(numero_quarto, andar, bloco, qtd_noite, servicos);
		this.preco_presidencial = preco_presidencial;
	}
	
	public void exibirInfos() {
		super.exibirInfos();
		System.out.println("Preco suite presidencial por noite " +preco_presidencial);
	}
	
	

}
