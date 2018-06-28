package br.com.sp.gov.matriz;

import java.util.Scanner;

public class Ex01Mat {

	public static void main(String[] valores) {

		Scanner teclado = new Scanner(System.in);

		int[][] mat = new int[5][5];

		
		
		
			for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.print("Informe o elemento da matriz" + (linha + 1) + (0 + 1));
				mat[linha][coluna] = teclado.nextInt();

			}
		}

		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < mat.length; coluna++) {
				System.out.print(mat[linha][coluna]);
			}

			System.out.println();
		}
		teclado.close();
		System.exit(0);
	}

}