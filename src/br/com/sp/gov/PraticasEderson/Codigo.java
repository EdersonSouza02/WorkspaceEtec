package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class Codigo {
	 public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        int cod;

	      	System.out.print("Verificador de C�digo\n\n");


	        System.out.print("Digite o C�digo:  ");
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
					System.out.println("O c�digo foi 4");
					break;
				default:
					System.out.println("C�digo inv�lido");
					teclado.close();
			}

	    }
}
