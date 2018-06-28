package br.com.sp.gov.TOO;

import java.util.Scanner;

public class SecretarioTeste  {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Secretario funcionario = new Secretario();
		
		
		System.out.println("Nome funcionario : ");
		
		funcionario.setNome(teclado.next());
		
		System.out.println("cpf :");
		funcionario.setCpf(teclado.next());
		System.out.println("salario");
		funcionario.setSalario(teclado.nextDouble());
		System.out.println("Senha :");
		
		funcionario.setSenha("tudobem");
		String senha=(teclado.next());
		
		funcionario.autentica(senha);
		
		double novoSalario = funcionario.bonificacao(funcionario.getSalario());
		
		System.out.println("funcionario:" + funcionario.getNome());
		System.out.println("Cpf" + funcionario.getCpf());
		System.out.println("Salario" + novoSalario);
		
		
		
		
		

		
		
		teclado.close();
		System.exit(0);

	}

}
