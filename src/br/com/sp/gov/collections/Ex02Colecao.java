package br.com.sp.gov.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02Colecao {

    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<String>();
        Scanner teclado = new Scanner(System.in);
        for (int cont = 1; cont <=20; cont++) {
            System.out.print("Informe o " + cont + " nome: ");
            listaNomes.add(teclado.next());

            
            
            System.out.println(cont + "na posição " + listaNomes);
        }


        teclado.close();
    }
}
