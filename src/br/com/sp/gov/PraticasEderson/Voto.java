
package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;


public class Voto {
    public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a sua idade");
        int idade=teclado.nextInt();
        
        
        if(idade<18){
            System.out.println("Voc� ainda n�o pode votar");
        
        }else if(idade>=18){
            System.out.println("Voto obrigat�rio");
            
        }else if(idade==16 || idade==17 || idade>70){
            System.out.println("Voto facultativo");
    
    }
    teclado.close();
    
}
}