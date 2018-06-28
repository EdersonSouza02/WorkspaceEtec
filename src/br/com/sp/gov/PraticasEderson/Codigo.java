package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class Codigo {
	 public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        int cod;

	      	System.out.print("Verificador de Código\n\n");


	        System.out.print("Digite o Código:  ");
	        cod = teclado.nextInt();



	        switch(cod){
				case 1:
					System.out.println("O codigo foi 1");
					break;
				case 2:
					System.out.println("O codigo foi 2");
					break;
				case 3:
					System.out.println("O codigo foi 3");
					break;
				case 4:
					System.out.println("O código foi 4");
					break;
				default:
					System.out.println("Código inválido");
					teclado.close();
			}

	    }
}
