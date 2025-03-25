package br.com.honda.veiculo;

public class Moto extends Veiculo{
	
	private String materialPeDeDescanso;
	private String modeloGuidao;
	
	
	public Moto(String mara, String modelo, String cor, String materialPeDeDescanso, String modeloGuidao) {
		super(mara, modelo, cor);
		this.materialPeDeDescanso = materialPeDeDescanso;
		this.modeloGuidao = modeloGuidao;
	}
	
	public void cair() {
		
		System.out.println("Caindo");
	}
	
	
	

}
