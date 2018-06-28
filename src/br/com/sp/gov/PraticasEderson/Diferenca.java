package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class Diferenca {
public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        int n1, n2, Diferenca;
	        System.out.print("Digite o primeiro número:  ");
	       n1 = teclado.nextInt();

	        System.out.print("Digite o segundo número:  ");
	        n2 = teclado.nextInt();


	        if(n1 >= n2){
	          Diferenca = n1 - n2;
	        }else{
	          Diferenca = n2 - n1;
	        }

	        System.out.println("diferença do menor para o menor é "+ Diferenca);
	        teclado.close();
}
}
