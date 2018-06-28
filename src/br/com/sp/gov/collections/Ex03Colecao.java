package br.com.sp.gov.collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex03Colecao {

    public static void main(String[] args) {
        ArrayList<Integer> listnumeros = new ArrayList<Integer>();
        Scanner teclado = new Scanner(System.in);

        int total = 0, pares = 0, impares = 0;

      
        
        
        for (int cont = 1; cont <=20; cont++) {
            System.out.print("Informe o " + cont+ " valor: ");
            int valor = teclado.nextInt();

            total += valor;

            if(valor % 2 == 0){

                pares += valor;

            }else{
                impares += valor;
            }

            listnumeros.add(valor);
        }
        System.out.println("Soma Total: " + total + "Soma pares: " + pares + "Soma impares: " + impares);


        teclado.close();


    }
}
