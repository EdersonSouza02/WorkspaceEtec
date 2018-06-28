
package br.com.sp.gov.condicional;

import java.util.Scanner;

public class Intervalo {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int a = 0;

		System.out.println("Informe um Valor : ");

		a = teclado.nextInt();

		if (a >= 0 && a <= 9) {

			System.out.println("Numero valido : " + a);

		} else {

			System.out.println("valor inválido : " + a);

		}

		teclado.close();
		System.exit(0);
	}
}
