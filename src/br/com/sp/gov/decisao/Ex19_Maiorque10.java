package br.com.sp.gov.decisao;
import java.util.Scanner;

public class Ex19_Maiorque10 {
    public static void main(String[]args){
        Scanner teclado=new Scanner (System.in);
        
        System.out.println("Informe um valor");
        int n1=teclado.nextInt();
        
        if(n1>10){
            
            System.out.println("O valor é maior que 10");
            
        }else
           System.out.println("O valor é menor que 10"); 
            
        teclado.close();
        System.exit(0);
        
        
        
        
        
    }
}
