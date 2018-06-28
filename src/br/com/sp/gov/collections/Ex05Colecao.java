package br.com.sp.gov.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05Colecao {

	public static void main(String[] args) {
		ArrayList<String> listnomes = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);
		String resposta = "";

		do {
			System.out.println("===================");
			System.out.println("1 - Cadastrar Nomes");
			System.out.println("2 - Listar Nomes   ");
			System.out.println("3 - Pesquisar Nomes");
			System.out.println("4 - Sair           ");
			System.out.println("===================");
			System.out.println("");
			System.out.print("Informe a opção");
			int opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				for (int cont = 1; cont <= 20; cont++) {
					System.out.print("Informe o " + cont + " nome");
					listnomes.add(teclado.next());
					System.out.println("Nome cadastrado com sucesso!");
				}
				break;

			case 2:
				System.out.print("Informe o nome que deseja procurar");
				String PesquisaNome = teclado.next();
				if (listnomes.contains(PesquisaNome)) {

					System.out.println("Nome encontrado!");

				} else {
					System.out.println("Nome não encontrado tente novamente");
				}
				break;

			case 3:
				for (String listanomes : listnomes) {
					System.out.println(listanomes);
				}
				break;

			case 4:
				System.exit(0);

			default:
				System.out.println("Opção Inválida");
			}

			System.out.print("Deseja Voltar ao menu? S (Sim) N (NÃ£o): ");
			resposta = teclado.next();

		} while (resposta.equals("S"));
		teclado.close();
	}
}
