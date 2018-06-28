package br.com.sp.gov.decisao;

import java.util.Scanner;

public class Ex17_SalarioAtualizado {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o salário");
		int a = teclado.nextInt();

		if (a <= 600) {

			System.out.println("Seu salario aumentou 30%");
		}

		if (a >= 600.01 && a <= 1.100) {

			System.out.println("Seu salario aumentou 25%");
		}

		if (a >= 1100.01 && a <= 2.400) {

			System.out.println("Seu salario aumentou 20%");
		}

		if (a >= 2400.01 && a <= 3.550) {
			System.out.println("Seu salario aumentou 15%");

		}
		if (a > 3550) {
			System.out.println("Seu salario aumentou 15%");

			teclado.close();
			System.exit(0);

		}

	}

}
