package br.com.sp.gov.matriz;

import java.util.Scanner;

public class Ex05Mat {

	public static void main(String[] metodo) {
		Scanner teclado = new Scanner(System.in);

		int[][] mat = new int[5][5];

		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				
				
				System.out.print("Digite o elemento " + (linha + 1) + (coluna + 1));
				mat[linha][coluna] = teclado.nextInt();

			}
		}

		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < mat.length; coluna++) {
				System.out.print(mat[linha][coluna] );

				if (mat[linha][coluna] % 2 == 0) {
					System.out.println("A quantidade de números pares é: " + mat[linha][coluna]);

				} else {
					System.out.println("A quantidade de números impares é " + mat[linha][coluna]);

				}

			}

			
			teclado.close();
		}

	}
}
