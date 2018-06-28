package br.com.sp.gov.condicional;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int x = 0;

		System.out.println("Informe um Valor : ");

		x = teclado.nextInt();

		if (x % 2 <= 0) {

			System.out.println("Par : " + x);

		} else {
			System.out.println("Impar : " + x);

		}

		teclado.close();
		System.exit(0);
	}

}
