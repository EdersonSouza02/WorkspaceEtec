package br.com.sp.gov.TOO;

public class FuncionarioHeranca {
	private String nome;
	private String cpf;
	private double salario;
	private String senha; 
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String autentica(String validar) {
		
				
		if (validar == senha ) {
			System.out.println( "Senha correta");
			
		} else {
			System.out.println( "Senha Incorreta");

		}
	
		return toString() ;
	}
public double bonificacao (double salario) {

	
salario = (salario*0.10)+ salario;
return salario;




	
	
	
	
}
	
	
	
}
