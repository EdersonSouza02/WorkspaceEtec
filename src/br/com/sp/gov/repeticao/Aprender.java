package br.com.sp.gov.repeticao;

import java.util.Scanner;

public class Aprender {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int nivel = 0;
		int resp = 0, h = 0;

		double total = 0;

		do {

			System.out.println("Informe o nome : ");
			String nome = teclado.next();

			System.out.println("Informe o nivel :");
			nivel = teclado.nextInt();

			System.out.println("Informe quantas horas de aula :");
			h = teclado.nextInt();

			System.out.println(nome);

			switch (nivel) {

			case 1:
				total = h * 12;
				System.out.println("Valor é: " + total);
				System.out.println(" ");
				System.out.println("Deseja continuar ? 1-Sim 2-NÃ£o ");
				resp = teclado.nextInt();
				break;

			case 2:
				total = h * 17;
				System.out.println("Valor Ã©: " + total);
				System.out.println(" ");
				System.out.println("Deseja continuar ? 1-Sim 2-NÃ£o ");
				resp = teclado.nextInt();
				break;

			case 3:
				total = h * 25;
				System.out.println("Valor é:  " + total);
				System.out.println(" ");
				System.out.println("Deseja continuar ? 1-Sim 2-NÃ£o ");
				resp = teclado.nextInt();
				break;

			default:
				System.out.println("Nivel inválido ");
				break;
			}

		} while (resp == 1);

		teclado.close();
		System.exit(0);
	}

}