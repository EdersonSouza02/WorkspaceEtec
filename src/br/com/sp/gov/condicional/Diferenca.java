
package br.com.sp.gov.condicional;

import java.util.Scanner;

public class Diferenca {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int a, b, c = 0;

		System.out.println("Informe os valores");

		a = teclado.nextInt();
		b = teclado.nextInt();

		if (a > b) {

			c = a - b;

		} else {

			c = b - a;

		}
		System.out.println("A diferen�a do maior para o menor � : " + c);

		teclado.close();
		System.exit(0);
	}

}
