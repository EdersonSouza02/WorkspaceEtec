package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class RevisaoScanner {
public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Informe valores para a divsão");
	int valor1 = teclado.nextInt();
	System.out.println("Informe outro valor");
	int valor2 = teclado.nextInt();
	
	
	int resultado = valor1/valor2;
	
	System.out.println("A divisão dos valores é" + resultado);
	teclado.close();
	
}
	
	
	
}
