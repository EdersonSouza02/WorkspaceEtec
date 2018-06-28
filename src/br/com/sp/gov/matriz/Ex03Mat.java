package br.com.sp.gov.matriz;


import javax.swing.JOptionPane;

public class Ex03Mat {

	public static void main(String[] diferentes) {
		int[][] mat = new int[10][5];
		int somaIguais = 0, somaDiferentes = 0;

		for (int linha = 0; linha < 10; linha++) {

			for (int coluna = 0; coluna < 5; coluna++) {

				String valor = JOptionPane.showInputDialog("Digite o valor na posicaoo " + (linha + 1) + (coluna + 1));
				mat[linha][coluna] = Integer.parseInt(valor);

				if (coluna == linha) {

					somaIguais += mat[linha][coluna];

				} else {

					somaDiferentes += mat[linha][coluna];

				}
			}
		}

		JOptionPane.showMessageDialog(null,
				"Soma dos indices iguais: " + somaIguais + "Soma dos indices diferentes: " + somaDiferentes);

	}
}
