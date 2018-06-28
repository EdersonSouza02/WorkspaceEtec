package br.com.sp.gov.condicional;

import java.util.Scanner;

public class SituacaoAluno {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o nome do aluno' ");

		String nome = teclado.next();

		System.out.println("Informe as notas do Aluno ");

		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();

		double media = (a + b + c) / 3;

		if (media >= 7) {
			System.out.println("Aluno : " + nome + "Nota Final : " + media);
			System.out.println("Aprovado");

		} else if (media >= 5.1 && media <= 6.9) {
			System.out.println("Aluno : " + nome + "Nota Final : " + media);

			System.out.println("Recuperação");

		} else if (media <= 5) {
			System.out.println("Aluno : " + nome + "Nota Final : " + media);

			System.out.println("Reprovado");
		}

		teclado.close();
		System.exit(0);

	}

}
