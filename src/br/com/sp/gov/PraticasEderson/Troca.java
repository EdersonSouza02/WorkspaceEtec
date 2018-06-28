package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class Troca {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A,B,VariavelTemporaria;

 System.out.print("Digite a variável A:  ");
      	A = teclado.nextInt();

      	System.out.print("Digite a variável B: ");
      	B = teclado.nextInt();



      	VariavelTemporaria = A;
        A = B;
        B = VariavelTemporaria;

        System.out.print("A="+ A + " " + "B="+"B");
        teclado.close();
}
}
