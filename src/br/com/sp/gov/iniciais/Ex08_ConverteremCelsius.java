
package br.com.sp.gov.iniciais;

import java.util.Scanner;

public class Ex08_ConverteremCelsius {
    
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        
        double cel;
        
        System.out.println("infomer a temperatura em Fº:");
        double f=teclado.nextDouble();
        
        cel=(f - 32) / 1.8;
        
         System.out.println("Sua temperatura em graus é:"+cel+"C°");
         
        
        teclado.close();
        System.exit(0);
        
    }
    
}
