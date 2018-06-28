package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class Comissao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float Porcen = 0,PrecoPeca,Quantidade,ValorComissao;
		
		System.out.print("Digite o preço unitário da peça: ");
		PrecoPeca = teclado.nextFloat();
		
		System.out.print("Digite a quantidade de peças vendidas: ");
		Quantidade = teclado.nextFloat();
		
		ValorComissao = (PrecoPeca * Quantidade) * Porcen; 
		
		System.out.printf("O valor da comissão em reais é", ValorComissao);
		teclado.close();
		
	}
}