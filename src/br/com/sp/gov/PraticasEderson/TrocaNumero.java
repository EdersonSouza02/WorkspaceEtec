
package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;


public class TrocaNumero {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor de A");
        int a = teclado.nextInt();

        System.out.println("Informe o valor de B");
        int b = teclado.nextInt();

        a = b;
        b = a;

        System.out.println("O novo valor de A �" + b);
        System.out.println("O novo valor de B �:" + a);
teclado.close();
    }
}
