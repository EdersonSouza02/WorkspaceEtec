package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class NumerosMaior {
public static void main(String[] args) {

			Scanner teclado = new Scanner(System.in);
			int numero,maior,menor;
			

			System.out.print("Digite um n�mero (negativo para sair): ");
			numero = teclado.nextInt();

			if(numero>=0){
				menor = numero;
				maior = numero;
				while(numero>=0){
					System.out.print("Digite outro n�mero: ");
					numero = teclado.nextInt();
						if(numero > maior){
							maior = numero;
						}
						if(numero < menor && numero>= 0){
							menor = numero;
						}
				}
				System.out.println("O maior n�mero foi "+maior+" e o menor foi "+menor);
				teclado.close();
			}

	}

}
