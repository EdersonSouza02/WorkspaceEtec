package br.com.sp.gov.iniciais;

import java.util.Scanner;

public class Ex06_Troca {
    
    public static void main(String[]args){
      
        
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor");
        int a=teclado.nextInt();
        System.out.println("Informe o segundo valor");
        int b=teclado.nextInt();
        
     
            
        a=b;
        b=a;
        
        System.out.println(a+"e"+b);
        
        
        teclado.close();
        System.exit(0);
        
        
        
        
        
            
        
      
        
        
        
        
    }
  
    
    
    
}
