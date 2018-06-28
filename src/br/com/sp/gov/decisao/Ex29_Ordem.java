package br.com.sp.gov.decisao;
import java.util.Scanner;

public class Ex29_Ordem {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor:");
        int valor1=teclado.nextInt();
        
        System.out.println("Informe o segundo valor:");
        int valor2=teclado.nextInt();
        
        System.out.println("Informe o terceiro valor:");
        int valor3=teclado.nextInt();
        
        if(valor1>valor2 && valor2>valor3){
            System.out.println("A ordem crescente é:");
             System.out.println(valor1);
             System.out.println(valor2);
             System.out.println(valor3);
        }
        if(valor2>valor1 && valor1>valor3){
            System.out.println("A ordem crescente é:");
            System.out.println(valor2);
            System.out.println(valor1);
            System.out.println(valor3);
        }
        if(valor3>valor1 && valor1>valor2){
            System.out.println("A ordem crescente é:");
            System.out.println(valor3);
            System.out.println(valor1);
            System.out.println(valor2);
            
        teclado.close();
        System.exit(0);
        
        }
    }
}
