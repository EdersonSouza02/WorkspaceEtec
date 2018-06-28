package br.com.sp.gov.repeticao;
import java.util.Scanner;
public class Operario {

	public static void main(String[] args) {
			int resp =0;
			double ht= 0,total = 0 ,e = 0  ; 
			
			Scanner teclado = new Scanner(System.in);
			
                        do { 	
			
                            System.out.println("Informe o codigo :");
				int cod = teclado.nextInt();
				
				System.out.println("Informe horas trabalhada : " );
					ht =teclado.nextDouble();
					
					total = 50 *10 ;
					
		
		if (ht > 50 ) {
			
			e = (ht  - 50) * 20;
			
		}else {
			
			
			total = ht *10 ;
		}
		
		System.out.println("Codigo :" + cod );
		
		System.out.println("50 horas trabalhada : " + total );
		System.out.println("Horas extras R$ :  " + e  );
		System.out.println("Total : " + (total + e));
		
		 System.out.println(" ");
	 	 
	 	 System.out.println("Deseja continuar ? 1-Sim 2-Não ");
	 	 resp = teclado.nextInt();
	 	 	
	 	 
	}while (resp == 1 );
	 
	teclado.close();
	System.exit(0);	
		
		 
	}

}