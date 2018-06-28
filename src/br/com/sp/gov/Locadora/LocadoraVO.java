package br.com.sp.gov.Locadora;


public class LocadoraVO {

	private int codigo;
	private String nome;
	private String genero;
	private String data_lancamento;
	
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
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getData_lancamento() {
		return data_lancamento;
	}
	public void setData_lancamento(String data_lancamento) {
		this.data_lancamento = data_lancamento;
	}
		
	public String toString(){
		
		return "Código"+this.codigo + "Nome"+this.nome+ "Gênero" + this.genero + "Data" + this.data_lancamento;

	}
	
	
}
