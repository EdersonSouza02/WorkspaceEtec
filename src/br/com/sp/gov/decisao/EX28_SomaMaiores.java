
package br.com.sp.gov.decisao;
import java.util.Scanner;


public class EX28_SomaMaiores {
    public static void main(String[]args){
        int total;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
     int v1=teclado.nextInt();
     System.out.println("Informe o segundo valor:");
     int v2=teclado.nextInt();
     System.out.println("Informe o terceiro valor:");
     int v3=teclado.nextInt();
     
     
         if(v1<v3 && v1<v2){
         total=v2+v3;
     System.out.println("A soma dos dois maiores é:"+total);
  }
       if(v2<v3 && v2<v1) {
    
       total=v3+v1;
System.out.println("A soma dos dois maiores é:"+total);

}
       if(v3<v1 && v3<v2){
           total=v1+v2;
           System.out.println("A soma dos dois maiores é:"+total);
           
           teclado.close();
           System.exit(0);
       
       
       }
       

    }
}


    
        
        
        
    
    
    

