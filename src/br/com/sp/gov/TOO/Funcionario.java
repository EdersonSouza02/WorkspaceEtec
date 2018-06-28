
package br.com.sp.gov.TOO;

public abstract class Funcionario {

	private String nome;
	private String cpf;
	private String telefone;
	private String endereco;

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void trabalhar() {
		System.out.println("Trabalhando");
	}

	public void cadastro() {
		System.out.println("Cadastrado com sucesso...");

	}
}