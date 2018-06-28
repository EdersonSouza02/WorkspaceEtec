package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class NumeroDecrescente {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        for (int cont = teclado.nextInt(); cont <= 0; cont--) {

            System.out.println("Informe 1 número");
            cont = teclado.nextInt();

            System.out.println(cont);
            
            teclado.close();
            System.exit(0);

        }

    }

}
