package br.com.sp.gov.iniciais;

import java.util.Scanner;

public class Ex11_LojaMamao {
    public static void main(String[]args){
        
        Scanner teclado=new Scanner(System.in);
        double prestacao;
        System.out.println("informe o valor do produto");
        double prod=teclado.nextDouble();
        
         prestacao = prod/5;
        
         System.out.println(" VocÃª poderá fazer em 5x de"+prestacao+"R$ mensais.");
        
        
        
        
        teclado.close();
    }
    
        
    
    
}
