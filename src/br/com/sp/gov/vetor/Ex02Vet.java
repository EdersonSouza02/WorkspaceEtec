package br.com.sp.gov.vetor;

import java.util.Scanner;

public class Ex02Vet {

	public static void main(String[] args) {
		
		int num[] = new int[15];
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println("Insira o :" + ( i + 1  ) +  " � n�mero : "  );
			
			num[i] = teclado.nextInt();
			
		}
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.println((i + 1) + "� num : " +  num[i]);
			
		if(i%2==0){
			System.out.println("O n�mero � par");
			
		}else{
			System.out.println("O n�mero � impar");
		}
		
		
			teclado.close();
		
		}
		

	}

}
