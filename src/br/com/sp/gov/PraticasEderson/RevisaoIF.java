package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class RevisaoIF {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("======Calculadora=========");
		System.out.println("1 - Adi��o");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");

		System.out.println("Informe a op��o");
		int opcao = teclado.nextInt();

		if (opcao == 1) {
			System.out.println("Informe o valor");
			int a = teclado.nextInt();
			System.out.println("Informe o valor");
			int b = teclado.nextInt();
			int resultado = a + b;
			System.out.println(resultado);

		} else if (opcao == 2) {
			System.out.println("Informe o valor");
			int a = teclado.nextInt();
			System.out.println("Informe o valor");
			int b = teclado.nextInt();
			int resultado = a - b;
			System.out.println(resultado);

		} else if (opcao == 3) {
			System.out.println("Informe o valor");
			int a = teclado.nextInt();
			System.out.println("Informe o valor");
			int b = teclado.nextInt();
			int resultado = a / b;
			System.out.println(resultado);

		} else if (opcao == 4) {
			System.out.println("Informe o valor");
			int a = teclado.nextInt();
			System.out.println("Informe o valor");
			int b = teclado.nextInt();
			int resultado = a / b;
			System.out.println(resultado);

		}
		teclado.close();
	}
}
