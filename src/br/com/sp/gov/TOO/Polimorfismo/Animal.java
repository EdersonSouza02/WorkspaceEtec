package br.com.sp.gov.TOO.Polimorfismo;

public class Animal {

	private String foto;
	private int idade;
	private String comida;
	private String localizacao;
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public void circular() {
		
		System.out.println("Animal - Circular");
		
	}
	
	public void fazerRuido() {
		
		System.out.println("Animal - Fazer Ruido");
		
	}
	
	public void comer() {
		
		System.out.println("Animal - Comer");
		
	}
	
	public void dormir() {
		
		System.out.println("Animal - Dormir");
		
	}
	
	
	
	
	
}
