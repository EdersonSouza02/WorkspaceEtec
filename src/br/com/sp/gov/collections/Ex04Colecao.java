package br.com.sp.gov.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04Colecao {

	public static void main(String[] args) {
		ArrayList<String> listnomes = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);

		for (int cont = 1; cont <= 5; cont++) {
			System.out.print("Informe o " + cont + " nome: ");
			listnomes.add(teclado.next());
			
			System.out.println("Na posi��o " + cont + "  o nome � " + listnomes);

		}

		System.out.print("Informe o nome para a pesquisa: ");
		String PesquisaNome = teclado.next();

		if (listnomes.contains(PesquisaNome)) {
			System.out.println("O nome foi encontrado");
		} else {
			System.out.println("N�o foi encontrado nenhum nome");
		}
		teclado.close();

	}
}
