package br.com.sp.gov.decisao;
import java.util.Scanner;

public class Ex13_PareImpar {
    public static void main(String[]args){
        
        Scanner teclado=new Scanner(System.in);
        System.out.print("Informe um numero");
        int numero=teclado.nextInt();
        
        
     if(numero % 2 == 0){
           
System.out.println("O número é par");
        
     }else{
            System.out.println("O número é impar");  
          teclado.close();
          System.exit(0);
          
 
     }
     
    }
}

         
          
           
       
       
           
             
        
        
    
    
    
