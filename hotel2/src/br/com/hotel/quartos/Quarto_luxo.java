package br.com.hotel.quartos;

public class Quarto_luxo extends Quarto{
	
	private int preco_luxo = 600;

	public Quarto_luxo(int numero_quarto, int andar, String bloco, int qtd_noite, String servicos, int preco_luxo) {
		super(numero_quarto, andar, bloco, qtd_noite, servicos);
		this.preco_luxo = preco_luxo;
	}
	
	public void exibirInfos() {
		super.exibirInfos();
		System.out.println("Preco Quarto luxo por noite " +preco_luxo);
	}
	


}
