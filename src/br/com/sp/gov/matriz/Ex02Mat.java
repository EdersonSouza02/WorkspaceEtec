package br.com.sp.gov.matriz;

import java.util.Scanner;

public class Ex02Mat {
	public static void main(String[] soma) {
		int mat[][]  = new int[10][5];
		int SomaTotal = 0;

		
		
		
		
		
		Scanner teclado = new Scanner(System.in);
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.print("Digite o valor " + (linha + 1) + (coluna + 1));

				mat[linha][coluna] = teclado.nextInt();
				SomaTotal = SomaTotal + mat[linha][coluna];

			}
		}

		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.print(mat[linha][coluna]);
				teclado.close();
			}
			System.out.println();
		}
		System.out.println("A soma dos valores da matriz é " + SomaTotal);

		teclado.close();
		System.exit(0);
	}
}
