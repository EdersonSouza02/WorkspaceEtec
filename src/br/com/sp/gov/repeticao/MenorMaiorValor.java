package br.com.sp.gov.repeticao;

import java.util.Scanner;

public class MenorMaiorValor {

	public static void main(String[] args) {

		Scanner p = new Scanner (System.in);
		
		double maior = 0 , menor = 0 ; 
		
			double x = 0;
		
		while ( x>= 0 ) {
			
			System.out.println("Informe um numero: ");
			
			 x = p.nextDouble();
			
				if (  x >  maior ) {
								
					maior = x;
							
			}else if (x >= 0 && x < maior ) {
				
			 menor = x ;

			}
									
		}
		
		
		System.out.println("Maior : " + maior  );
		System.out.println("Menor : " + menor );
	p.close();
		
		
System.exit(0);
	}

}