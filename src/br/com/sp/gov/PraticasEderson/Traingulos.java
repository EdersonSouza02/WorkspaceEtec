package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class Traingulos {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A, B, C; 

      System.out.print("Digite o lado A");
        A = teclado.nextInt(); 
		
        System.out.print("Digite o lado B");
        B = teclado.nextInt();
		
		System.out.print("Digite o lado C");
        C = teclado.nextInt(); 


		if( A < B + C && B < A + C && C < A + B ){ 
			System.out.print("O tri�ngulo � Eq�il�tero.");
			}else if(A==B || A==C || B==C){ 
				System.out.print("O tri�ngulo � Is�sceles.");
			}else{ 
				System.out.print("O tri�ngulo � Escaleno.");
				teclado.close();
			}
		
		}
	}

