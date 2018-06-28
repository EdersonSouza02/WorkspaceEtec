package br.com.sp.gov.TOO;
import java.util.Scanner;

public class FuncionarioTeste  {
		
	
	public static void main (String[] args, String nome, String cpf,String endereco ){
		
		Scanner ler = new Scanner(System.in);
		Funcionario p= new Gerente();
		
		System.out.println ("Insira seu nome");
	
		nome = ler.next();
		System.out.println("Insira seu cpf");
		cpf = ler.next();
		System.out.println("Insira seu endereco");
		endereco = ler.next();
		
		p.setNome( ler.next());
		p.setCpf( ler.next());
		p.setEndereco(ler.next());
		p.setTelefone(ler.next());
		
		
		p.trabalhar();

		
		System.out.println ("nome : " + p.getNome());
		System.out.println ("Cpf : " + p.getCpf());
		System.out.println ("Endereco : " + p.getEndereco());
		System.out.println ("Telefone : " + p.getTelefone());
		
			p.cadastro();                                                                       
		
			ler.close();
	}
        
}
