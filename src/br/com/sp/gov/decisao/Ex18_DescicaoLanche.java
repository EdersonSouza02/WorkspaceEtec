
package br.com.sp.gov.decisao;

import java.util.Scanner;

public class Ex18_DescicaoLanche {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o c�digo do produto");
		int cod = teclado.nextInt();

		switch (cod) {

		case 100:

			System.out.println("X-Salada com coca-cola.");

		case 200:

			System.out.println("Hot dog com suco de laranja");

		case 300:

			System.out.println("Sanduiche natural com suco de uva.");

		case 400:

			System.out.println("Misto Quente com fanta laranja.");

		case 500:

			System.out.println("P�o com manteiga com caf�.");

		case 600:

			System.out.println("P�o com manteiga na chapa com caf� com leite.");

		default:

			System.out.println("C�digo informado inv�lido.");

			teclado.close();
			System.exit(0);

		}

	}
}
