package br.com.sp.gov.iniciais;

import java.util.Scanner;

public class Ex01_Soma {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o primeiro valor:");
		int valor = teclado.nextInt();

		System.out.println("Digite o segundo valor:");
		int valor2 = teclado.nextInt();

		System.out.println("A soma dos valores é:");

		System.out.println(valor + valor2);

		teclado.close();
		System.exit(0);

	}

}
