
package br.com.sp.gov.condicional;

import java.util.Scanner;

public class MaiorMenorIgual {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int a, b = 0;

		System.out.println("Informe os valores");

		a = teclado.nextInt();
		b = teclado.nextInt();

		if (a > b) {

			System.out.println("O valor =" + a + "  é maior que " + b);

		} else if (b > a) {

			System.out.println("O valor =" + b + " é maior que " + a);

		} else {
			System.out.println(" Iguais : " + a);

			teclado.close();
			System.exit(0);
		}
	}
}
