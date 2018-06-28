package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class RevisaoSwitch {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("======Calculadora=========");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");

		System.out.println("Informe a opção");
		int opcao = teclado.nextInt();

	switch(opcao){
	case 1:		
	System.out.println("Informe o valor");
			int a = teclado.nextInt();
			System.out.println("Informe o valor");
			int b = teclado.nextInt();
			int resultado = a + b;
			System.out.println(resultado);

	case 2:
			System.out.println("Informe o valor");
			int a1 = teclado.nextInt();
			System.out.println("Informe o valor");
			int b1 = teclado.nextInt();
			int resultado1 = a1 - b1;
			System.out.println(resultado1);

	case 3: 
			System.out.println("Informe o valor");
			int a2 = teclado.nextInt();
			System.out.println("Informe o valor");
			int b2 = teclado.nextInt();
			int resultado2 = a2 / b2;
			System.out.println(resultado2);

		case 4:
			System.out.println("Informe o valor");
			int a3 = teclado.nextInt();
			System.out.println("Informe o valor");
			int b3 = teclado.nextInt();
			int resultado3 = a3 / b3;
			System.out.println(resultado3);

		}
	teclado.close();
	}

		
		
		
	}
	

