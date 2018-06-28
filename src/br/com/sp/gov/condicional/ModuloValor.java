package br.com.sp.gov.condicional;

import java.util.Scanner;

public class ModuloValor {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int x = 0;
		System.out.println("Informe um valor");

		x = teclado.nextInt();

		if (x >= 0) {

			System.out.println(x);

		} else {

			x = x * (-1);
			System.out.println(x);
		}

		teclado.close();
		System.exit(0);
	}

}
