package br.com.sp.gov.iniciais;

import java.util.Scanner;

public class Ex05_Aluno {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double media;
		System.out.println("Informe o nome do aluno");
		String nome = teclado.next();

		System.out.println("Informe a primeira nota");
		int nota1 = teclado.nextInt();

		System.out.println("Informe a segunda nota");
		int nota2 = teclado.nextInt();

		System.out.println("Informe a terciera nota");
		int nota3 = teclado.nextInt();

		media = (nota1 + nota2 + nota3) / 3;

		System.out.println("O nome do aluno é:" + nome + "E sua média aritmética é:" + media);

		teclado.close();
		System.exit(0);

	}

}
