
package br.com.sp.gov.iniciais;

import java.util.Scanner;

public class Ex04_Vendedor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		
		
		
		
		
		int comissao;
		int salariofinal;

		System.out.println("Informe o nome do vendedor");
		String nome = teclado.next();

		System.out.println("Informe o sal�rio do vendedor");
		int salario = teclado.nextInt();

		System.out.println("Informe a venda no m�s");
		int venda = teclado.nextInt();

		comissao= venda * 15 / 100;

		salariofinal = salario + comissao;

		System.out.println("O nome do vendedor �:" + nome + "O salario dele no fim do m�s �:" + salariofinal);

		teclado.close();
		System.exit(0);

	}

}
