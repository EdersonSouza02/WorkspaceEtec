package br.com.sp.gov.decisao;
import java.util.Scanner;

public class Ex27_Maior {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor:");
        int  v1=teclado.nextInt();
        System.out.println("Informe o segundo valor:");
        int v2=teclado.nextInt();
        System.out.println("Informe o terceiro valor:");
        int v3=teclado.nextInt();
        
        if(v1>v2){
            System.out.println("O primeiro valor é maior que o segundo");
            
            
        }
        if(v1>v3){
            
            System.out.println("O primeiro valor é maior que o terceiro");
        }
        if(v2>v1){
            
            System.out.println("O segundo valor é maior que o primeiro");
            
        }
        if(v2>v3){
            
            System.out.println("O segundo valor é maior que o terceiro");
        }
        
        if(v3>v1){
            System.out.println("O terceiro valor é maior que o primeiro");
            
            
        }
            if(v3>v2){
                System.out.println("O terceiro valor é maior que o segundo");
          
            teclado.close();
            System.exit(0);
            }
        
        
    }
}
