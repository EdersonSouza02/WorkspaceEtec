package br.com.sp.gov.OO;

import java.util.Scanner;

public class Ex56OOMain {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe um valor: ");

		if (new Ex56OO().parOuImpar(teclado.nextInt())) {
			System.out.println("Par.");
		} else {

			System.out.println("Impar.");

		}

		teclado.close();
		System.exit(0);
	}

}
