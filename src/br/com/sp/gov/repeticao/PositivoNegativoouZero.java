package br.com.sp.gov.repeticao;
import java.util.Scanner;

public class PositivoNegativoouZero {

		public static void main(String[] args) {
		
				Scanner teclado = new Scanner(System.in);

			double resp;	 
				
				
		do {
				
				
			System.out.println("Informe um numero ");
		        
				int num=teclado.nextInt();
		        
		    
				if (num < 0 ) {
					
					System.out.println("Negativo : " + num);

				}else if (num > 0 ) {
					
					System.out.println("Positvo : " + num);
					
				}else if (num == 0 ) {
					
					System.out.println(" zero : " + num);
					
					}
				 
			System.out.println("Deseja continuar ? 1(sim) 2(n�o) ");
			 	 	resp = teclado.nextDouble();
			 	 	
			 	 
			}while (resp == 1 );
			 
			
				
				teclado.close();
				System.exit(0);
			}

		
		}
