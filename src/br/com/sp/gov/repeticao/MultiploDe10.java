package br.com.sp.gov.repeticao;

import java.util.Scanner;

public class MultiploDe10 {

	public static void main(String[] args) {
		
	
			Scanner p = new Scanner (System.in);
			
			for (int cont=0 ; cont <= 100 ; cont++ ) {
				
			if ( cont % 10 <=0 ) {
				
				
				System.out.println("MUltiplo de 10 :" + cont );
				
				
			}
			
			p.close(); 
			
			
			}

			System.exit(0);
		}

	}