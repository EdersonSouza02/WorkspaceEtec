package br.com.sp.gov.escola;

public class AlunoVO {
	private int rm;
	private String nome;
	private String endereco;
	private int idade;

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String toString() {
		return "Rm" + this.rm + "Nome" + this.nome + "Endereco" + this.endereco + "Idade" + this.idade;

	}

}
