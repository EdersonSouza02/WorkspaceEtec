package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class ValoresAte9 {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int Numero;

      System.out.print("Digite o primeiro n�mero:  ");
        Numero = teclado.nextInt();



        if(Numero >= 0 && Numero <= 9){
          System.out.println("Valor v�lido.");
        }else{
          System.out.println("Valor inv�lido.");
          teclado.close();
        }

    }
}
