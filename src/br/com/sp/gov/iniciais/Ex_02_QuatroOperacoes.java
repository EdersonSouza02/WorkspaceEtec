package br.com.sp.gov.iniciais;

import java.util.Scanner;

public class Ex_02_QuatroOperacoes {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o primeiro valor:");
		int valor1 = teclado.nextInt();

		System.out.println("Digite o segundo valor:");
		int valor2 = teclado.nextInt();

		System.out.println("A soma dos valores �:");
		System.out.println(valor1 + valor2);

		System.out.println("A subtra��o dos valores �:");
		System.out.println(valor1 - valor2);

		System.out.println("A multiplica��o dos valores �:");
		System.out.println(valor1 * valor2);

		System.out.println("A divis�o dos valores �:");
		System.out.println(valor1 / valor2);

		teclado.close();
		System.exit(0);

	}

}
