package br.com.sp.gov.repeticao;
import java.util.Scanner;


public class NumerosPositivos {
    public static void main(String[]args){
        
        Scanner teclado=new Scanner(System.in);
    
        int par=0 , impar=0;
        
      System.out.println("Informe o valor");
        int n1=teclado.nextInt();
        
        
        
        
         for(n1=0;n1<=200;n1++){
       
    if(n1 %2 <=0){
    
       n1++;
       par=n1+par;
      
  
   }else{
       n1++; 
        impar=n1+impar;
        
   teclado.close();
   System.exit(0);
   
   }
    
   
}
    }
    
}