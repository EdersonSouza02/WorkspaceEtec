package br.com.sp.gov.repeticao;

import java.util.Scanner;

public class ServicoMilitar {
	

		public static void main(String[] args) {
			
		 
                Scanner teclado = new Scanner(System.in);
                 double total2 = 0 , total = 0 ;
		 int sau, idade = 0 ; 
		 int resp = 0; 
		 
		 
		do { 
		 System.out.println("Informe seu nome : ");
		 	String nome = teclado.next();
		 	System.out.println("Informe seu sexo :");
		 		String sexo = teclado.next();
		 	
		 	
		 	System.out.println("Informe sua idade :");
		 	 idade = teclado.nextInt();
		 	 
		 	 System.out.println("Você está saudavel?  1-sim , 2-n�o");
		 	 	sau=teclado.nextInt();
		 	 	
		 	 
		 	 if ( sau == 1 && idade >= 18  ) {
		 		 
		 		 System.out.println("NOme : " + nome);
			 	 System.out.println("sexo " + sexo );
		 		 
		 		 System.out.println("A pessoa está apta para servir"); ;
		 		 
		 		 total++ ; 
                                 
		 	 }else {
		 		 System.out.println("Nome : " + nome);
			 	 System.out.println("sexo " + sexo );
		 		 System.out.println( );
		 		 
                                 total2++ ; 
		 		 
		 	 }
		 
		 	 System.out.println("Aptos : " +  total );
		 	 System.out.println("Pessoas não aptas : " + total2);
		 	 
		 	
		 	 
		 	 System.out.println("Deseja continuar ? 1(sim) 2(n�o) ");
		 	 	resp = teclado.nextInt();
		 	 	
		 	 
		}while (resp == 1 );
		 
		teclado.close();
		System.exit(0);		
		}
		
		
	


}

