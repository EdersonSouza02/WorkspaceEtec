
package br.com.sp.gov.iniciais;

import java.util.Scanner;

public class Ex03_Consumo {
    public static void main(String[]args){
    Scanner teclado= new Scanner(System.in);
    
    
    double media;
    
            
            System.out.println("Informe a dist�ncia percorrida em KM");
            int dp=teclado.nextInt();
            
            System.out.println("Informe o combustivel gasto:");
            int cg=teclado.nextInt();
            media=cg/dp;
    
            
            System.out.println("A m�dia de seu veiculo �:");
    System.out.println(media);
            
            teclado.close();
            System.exit(0);
    }
    
    
    
}
