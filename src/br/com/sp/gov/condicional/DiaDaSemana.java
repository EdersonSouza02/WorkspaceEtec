
package br.com.sp.gov.condicional;

import java.util.Scanner;


public class DiaDaSemana {
   public static void main (String [] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int dia = 0; 
		
		System.out.println("Informe o dia da semana");
		
			dia = teclado.nextInt();
			
			switch (dia) { 
			
			case 1:
			      System.out.println("Segunda");
			      break ;
			case 2:
			      System.out.println("Terça");
			      break ; 
			case 3:
			      System.out.println("Quarta");
			      break ;
			case 4:
			      System.out.println("Quinta");
			case 5:
			      System.out.println("Sexta");
			      break ;
			case 6:
			      System.out.println("Sabado");
			      break ;
			case 7:
			      System.out.println("Domingo");
			      break ;
			
                        default:
                            System.out.println("Dia invalido");
                        }
				
                            teclado.close();
                            System.exit(0);
	
			}

                           
	}

    

