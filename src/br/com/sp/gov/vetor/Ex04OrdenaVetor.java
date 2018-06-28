package br.com.sp.gov.vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04OrdenaVetor {
public static void ordenaVetor(int num){
	Scanner numeros = new Scanner(System.in);
	
	System.out.println("Informe o tamanho do vetor");
	int[]valor = new int[numeros.nextInt()];
	          
	           
	for (int i = 1; i < valor.length; i++) 
	           {
		           System.out.print("Digite "+ i + "° numeros: "); 
		          valor[i] = (numeros.nextInt());
		       }
	           
	
	           Arrays.sort(valor);
	           
	          System.out.print("Ordem crescente:    "); 
	       	  for (int j = 1; j < valor.length; j++) 
	       	  {
	       		System.out.print(valor[j]+ "  ");       		
			  
	       	  
	       	  numeros.close();
	       	  
	       	  }
	}
	
	
}
	

	
	

