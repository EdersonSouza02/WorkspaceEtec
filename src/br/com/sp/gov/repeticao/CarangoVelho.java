package br.com.sp.gov.repeticao;
import java.util.Scanner; 

public class CarangoVelho {

	public static void main(String[] args) {
		
	 Scanner teclado = new Scanner(System.in);
	 double valor , total = 0 ;
	 int ano = 0 ; 
	 int resp = 0; 
	 
	do { 
	 System.out.println("Informe o Valor do veiculo : ");
	 	valor = teclado.nextDouble();
	 	
	 	System.out.println("Informe o ano :");
	 	 ano = teclado.nextInt();
	 	 
	 	 if (ano <= 2000 ) {
	 		 
	 		 total = valor - (valor * 0.12) ;
	 		 
	 	 }else {
	 		 
	 		 
	 		 total = valor - (valor * 0.07) ; 
	 		 
	 	 }
	 	 System.out.println("Valor a ser pago : " + total );
	 	 
	 	 System.out.println(" ");
	 	 
	 	 System.out.println("Deseja continuar ? 1-Sim 2-Não ");
	 	 	resp = teclado.nextInt();
	 	 	
	 	 
	}while (resp == 1 );
	 
	teclado.close();
	System.exit(0);		
	}
	
	
}