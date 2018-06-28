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
			System.out.print("O triângulo é Eqüilátero.");
			}else if(A==B || A==C || B==C){ 
				System.out.print("O triângulo é Isósceles.");
			}else{ 
				System.out.print("O triângulo é Escaleno.");
				teclado.close();
			}
		
		}
	}

