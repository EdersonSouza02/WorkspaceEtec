package br.com.sp.gov.concessionaria;

public class CarroVO {
	
	private int id;
	private String nome;
	private String marca;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
	
		return "ID: " + this.id + " NOME: " + this.nome + " Marca " + this.marca;
	}
	
	
	
}
