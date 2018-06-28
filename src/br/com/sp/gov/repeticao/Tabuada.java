
package br.com.sp.gov.repeticao;
import java.util.Scanner;


public class Tabuada {
    public static void main(String[]args){
        
        Scanner teclado=new Scanner(System.in);
        
        int total;
        int x;
        int y=0;
        
        System.out.println("Escolha a tabuada:");
        y=teclado.nextInt();
        
        
        for(x=0;x<=10;x++){
            
          total=x*y;  
          
            System.out.println("x * y é:");
            System.out.println(total);
                    
            
            teclado.close();
            System.exit(0);
        }
        
        
        
        
        
    }
}


