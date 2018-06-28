package br.com.sp.gov.OO;

import java.util.Scanner;

public class Ex57OOMain {

    public static void main(String[] args) {
        
        
    	Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o dia");
        int dia=teclado.nextInt();

        Ex57OO.getDescricaoDiaSemana(dia);
        

    teclado.close();
    System.exit(0);
    
    }
}


        
        
       
