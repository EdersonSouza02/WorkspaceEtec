package br.com.sp.gov.repeticao;

import java.util.Scanner;

public class IdadeNarrador {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		

		System.out.println("Informe o nome do atleta : ");
		String nome = teclado.next();

		System.out.println("Informe a idade : ");
		int idade = teclado.nextInt();

		
                while(idade>5){
                
                if (idade >= 5 && idade <= 7) {

			System.out.println("Nome : " + nome);
			System.out.println("Idade : " + idade);
			System.out.println("Categoria : Infantil A");

		} else if (idade >= 8 && idade <= 10) {

			System.out.println("Nome : " + nome);
			System.out.println("Idade : " + idade);
			System.out.println("Categoria : Infantil B ");

		} else if (idade >= 11 && idade <= 13) {

			System.out.println("Nome : " + nome);
			System.out.println("Idade : " + idade);
			System.out.println("Categoria : Juvenil A ");

		} else if (idade >= 14 && idade <= 17) {

			System.out.println("Nome : " + nome);
			System.out.println("Idade : " + idade);
			System.out.println("Categoria :Juvenil B ");
		} else if (idade >= 18 && idade <= 25 ) {

			System.out.println("Nome : " + nome);
			System.out.println("Idade : " + idade);
			System.out.println("Categoria :Senior ");

		} else {

			System.out.println("idade fora da faixa etária !!");
		}

		teclado.close();
		System.exit(0);
	}

}
}