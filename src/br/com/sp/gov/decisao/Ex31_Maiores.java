package br.com.sp.gov.decisao;
import java.util.Scanner;

public class Ex31_Maiores {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor:");
        int valor1=teclado.nextInt();
        
         System.out.println("Informe o segundo valor:");
        int valor2=teclado.nextInt();
        
        if(valor1>valor2){
            System.out.println("Primeiro � maior");
            
        }
        
        if(valor2>valor1){
            System.out.println("Segundo � maior");
        }
        
        if(valor1==valor2){
            System.out.println("Os n�meros s�o iguais");
            
            
       teclado.close();
       System.exit(0);
        }
        
        
    }
}
