package br.com.sp.gov.decisao;

import java.util.Scanner;

public class Ex16_Dia {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o dia da semana");

		int dia = teclado.nextInt();

		switch (dia) {

		case 1:

			System.out.println("Segunda");
			break;

		case 2:

			System.out.println("Terça");
			break;

		case 3:

			System.out.println("Quarta");
			break;

		case 4:

			System.out.println("Quinta");
			break;

		case 5:
			System.out.println("Sexta");
			break;

		case 6:
			System.out.println("Sabado");
			break;

		case 7:
			System.out.println("Domingo");
			break;

		default:
			System.out.println("Valor inválido");

			teclado.close();
			System.exit(0);

		}

	}

}
