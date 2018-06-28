package br.com.sp.gov.vetor;

import java.util.Scanner;

public class Ex01Vet {

	public static void main(String[] args) {

		String nome[] = new String[10];

		Scanner teclado = new Scanner(System.in);

		
		
		for (int i = 0; i < nome.length; i++) {

			System.out.println("Insira o :" + (i + 1) + " º nome : ");

			nome[i] = teclado.next();

		}

		for (int i = 0; i < nome.length; i++) {

			System.out.println((i + 1) + " nome : " + nome[i]);

		}

		teclado.close();
		System.exit(0);

	}

}
