package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class Cotacao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
    double cot, vd,vr;

  System.out.print("Digite a cotação do dolar: ");
    cot = teclado.nextDouble();

    
    System.out.print("Digite o valor em dolar: ");
    vd= teclado.nextDouble();

    vr = cot * vd;

    System.out.print("O Valor em reais é " + vr + "\n");
    teclado.close();
}
}