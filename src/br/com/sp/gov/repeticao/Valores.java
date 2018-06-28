package br.com.sp.gov.repeticao;

import java.util.Scanner;

public class Valores {

	public static void main(String[] args) {
		
	Scanner p = new Scanner (System.in);
		double maior = 0 , menor = 0 ; 
		double v1 = 0 , med = 0;
			
			
	
			
			for (int x = 0 ; x <= 10 ; x++ ) {
				
			System.out.println("Informe um numero positivo: ");
			
			 v1 = p.nextDouble();
			 
			 med = v1 + med / 10 ;
			
				if (  v1 >  maior ) {
								
					maior = v1;
							
			}else if ( v1 < maior ) {
				
			 menor = v1 ;

			}
			}
		
		System.out.println("Maior : " + maior  );
		System.out.println("Menor : " + menor );
		System.out.println("Media : " + med );
	p.close();				

        System.exit(0);
	}

	}