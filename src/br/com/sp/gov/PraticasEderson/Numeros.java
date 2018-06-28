package br.com.sp.gov.PraticasEderson;
import java.util.Scanner;
public class Numeros {
	
	public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
		int PrimeiroNumero, SegundoNumero;
		boolean MenorOuIgual=false, Menor=false, Maior=false, NaoIgual=false,Igual=false, MaiorOuIgual=false;	
		System.out.print("Digite o primeiro número:  ");
		PrimeiroNumero = teclado.nextInt();
		
		System.out.print("Digite o segundo número: ");
		SegundoNumero = teclado.nextInt();
		
		if(PrimeiroNumero == SegundoNumero) Igual = true;
		if(PrimeiroNumero != SegundoNumero) NaoIgual = true;
		if(PrimeiroNumero > SegundoNumero) Maior = true;
		if(PrimeiroNumero < SegundoNumero) Menor = true;
		if(PrimeiroNumero >= SegundoNumero) MaiorOuIgual = true;
		if(PrimeiroNumero <= SegundoNumero) MenorOuIgual = true;

		System.out.println("\nIgual = "+Igual);
		System.out.println("Não Igual = "+NaoIgual);
		System.out.println("Maior = "+Maior);
		System.out.println("Menor = "+Menor);
		System.out.println("Maior ou igual = "+MaiorOuIgual);
		System.out.println("Menor ou igual = "+MenorOuIgual);
			teclado.close();
	    }

	}


