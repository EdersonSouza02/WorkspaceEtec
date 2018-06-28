package br.com.sp.gov.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01Colecao {
    public static void main(String[] args) {
        ArrayList<Integer> listnumeros = new ArrayList<Integer>();
        
        Scanner teclado = new Scanner(System.in);
        for (int cont = 1; cont <=20; cont++) {
            System.out.print("Informe o " + cont + " valor: ");
            listnumeros.add(teclado.nextInt());
        }
        
        System.out.println(listnumeros);

        teclado.close();
    }
}
