
package br.com.sp.gov.condicional;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String senha = "";

		System.out.println("Digite sua senha : ");

		senha = teclado.next();

		if (senha.equals("@MinhaSenha")) {

			System.out.println(" Acesso permitido");

		} else {
			System.out.println("Acesso negado");

		}

		teclado.close();
		System.exit(0);
	}
}
