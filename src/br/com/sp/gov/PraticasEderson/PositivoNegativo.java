package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        int numero;

     int resp;
	do {
          System.out.print("Digite um número");
          numero = teclado.nextInt();
          if(numero>0){
            System.out.print("O número é positivo");
          }else if(numero < 0){
            System.out.print("O número é negativo");
          }
          System.out.println("Deseja continuar? 1-Sim 2-Não");
         resp=teclado.nextInt();
        }while(resp== 1);
	teclado.close();

	}

}
