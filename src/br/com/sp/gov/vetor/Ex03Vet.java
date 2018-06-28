package br.com.sp.gov.vetor;

import java.util.Scanner;

public class Ex03Vet {

	public static void main(String[] args) {
		
		int num[] = new int[20];
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println("Insira o :" + ( i + 1  ) +  " º número : "  );
			
			num[i] = teclado.nextInt();
			
		}
		for (int i = 10; i < num.length; i--) {
			System.out.println(num[i]);
			
		}
		
		for (int i = 10; i < num.length; i--) {
			System.out.println(num[i]);
			
		
		teclado.close();
		System.exit(0);
		
		}
			
			
	}


}


