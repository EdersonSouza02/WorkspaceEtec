package br.com.sp.gov.repeticao;

import java.util.Scanner;

public class IntervaloEntre10E150 {
	
	public static void main(String[] args) {
		
		int num = 0, intervalo = 0  ; 
		
		Scanner teclado = new Scanner(System.in);
		
		for (int cont = 0; cont <= 80 ; cont++) {
			System.out.println("Insira um numero entre 10 & 150 :");
			 
			num=teclado.nextInt();
			
			if (num >= 10 && num <= 150 ){
				
				intervalo++ ; 
				
				
				
			}
			
			
			
			
			
		}
		
		System.out.println("Foi digitado : " + intervalo);
		teclado.close();
		System.exit(0);
	}

}