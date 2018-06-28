package br.com.sp.gov.decisao;

import java.util.Scanner;

public class Ex14_ordemcrescente {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o primeiro valor");
		int a = teclado.nextInt();
		;

		System.out.println("Informe o segundo valor");
		int b = teclado.nextInt();

		if (a < b) {

			System.out.println("A ordem crescente é:");
			System.out.println(a);
			System.out.println(b);

			teclado.close();
			System.exit(0);

		}

	}

}
