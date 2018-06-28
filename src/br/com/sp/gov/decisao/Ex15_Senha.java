package br.com.sp.gov.decisao;

import java.util.Scanner;

public class Ex15_Senha {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe sua senha");
		String senha = teclado.next();

		if (senha.equals("@MinhaSenha")) {

			System.out.println("Acessp permitido");

		}

		else {

			System.out.println("Acesso permitido");

			teclado.close();
			System.exit(0);

		}

	}

}
