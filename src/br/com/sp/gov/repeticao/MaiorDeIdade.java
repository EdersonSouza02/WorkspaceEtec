package br.com.sp.gov.repeticao;

import java.util.Scanner;

public class MaiorDeIdade {
	
	public static void main(String[] args) {
		
				
	int num = 0; 
				
Scanner teclado = new Scanner(System.in);
	
            for (int cont = 0; cont <= 75 ; cont++) {
	System.out.println("Insira uma idade");
					 
	num=teclado.nextInt();
					
	if (num >= 18 ){
						
	System.out.println ("Maior de idade : " + num );
						
						
	}else if (num <18) {
					
	System.out.println("Menor de idade : " + num );
					
					
					}
				
			
}
				teclado.close();
				System.exit(0);
	}
}