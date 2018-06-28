package br.com.sp.gov.iniciais;

import java.util.Scanner;


public class Ex07_GrausCelsius {
    public static void main(String[]args){
        
        Scanner teclado=new Scanner(System.in);
        
        double fah;
        
    
        
        
        System.out.println("Informe a temperatura em Celsius:");
        double c = teclado.nextInt();
    
       
       fah=(c*1.8)+32;
       
       
        System.out.println("sua temperatura em FÂ° é:"+fah);
        
        
        teclado.close();
        System.exit(0);
        
        
        
        
    }
    
    
}
