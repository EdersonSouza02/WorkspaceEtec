package br.com.sp.gov.Empresa;

public class FuncionarioVO {
	private int codigo;
	private String nome;
	private String endereco;
	private String cpf;
	private String rg;
	
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String toString(){
		return "Código" + this.codigo + "Nome" + this.nome +"Endereco" + this.endereco + "cpf" +this.cpf + "RG" + this.rg;
		
		
		
	}
	
	
	
}
