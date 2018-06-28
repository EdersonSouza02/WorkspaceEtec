package br.com.sp.gov.mercado;

public class ProdutoVO {

	private int codigo;
	private String nome;
	private int validade;
	private String tipo;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValidade() {
		return validade;
	}
	public void setValidade(int validade) {
		this.validade = validade;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String toString() {
		
		return "Código: " + this.codigo + " Nome: " + this.nome + " Validade: " + this.validade+ "Tipo" + this.tipo;
	}
	
	
	
	
}
