
package br.com.sp.gov.OO;
import java.util.Scanner;

public class Ex62OOMain {
   public static void main(String[]args){
       
       
       Scanner teclado = new Scanner(System.in);
       
       
       
       System.out.println("Informe a idade do atleta");
       int idade=teclado.nextInt();
       
       Ex62OO.getCategoria(idade);
       
       teclado.close();
       System.exit(0);
       
       
   } 
    
    
}
