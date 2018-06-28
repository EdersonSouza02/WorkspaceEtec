package br.com.sp.gov.repeticao;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
	
			Scanner teclado = new Scanner(System.in);

			
			
			
		for (int cont = 0; cont <=20 ; cont++) {
			
			
		System.out.println("Informe um numero ");
	        
			int num=teclado.nextInt();
	        
	    
			if (num < 25) {
				
				System.out.println("O número é menor que 25 ");

			}else if (num > 80 ) {
				
				System.out.println("O número é maior que 80 ");
				
			}else if (num == 40) {
				
				System.out.println("O número é 40");
				
				
			}
		}
			
			teclado.close();
			System.exit(0);
		}

	
	}