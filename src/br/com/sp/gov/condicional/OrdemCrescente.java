
package br.com.sp.gov.condicional;

import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int a, b = 0;

		System.out.println("Informe os valores");

		a = teclado.nextInt();
		b = teclado.nextInt();

		if (a < b) {

			System.out.println("Ordem crescente");
			System.out.println(a);
			System.out.println(b);

		} else if (b < a) {

			System.out.println("Ordem decrescente");
			System.out.println(b);
			System.out.println(a);
		}
		teclado.close();
		System.exit(0);
	}

}
