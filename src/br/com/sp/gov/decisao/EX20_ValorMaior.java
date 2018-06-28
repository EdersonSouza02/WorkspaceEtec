package br.com.sp.gov.decisao;



import java.util.Scanner;

public class EX20_ValorMaior {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
      
        System.out.println("Informe o primeiro valor");
        int n1=teclado.nextInt();
        System.out.println("Infrome o segundo valor");
        int n2=teclado.nextInt();
        
        
        if(n1>n2){
            System.out.println("O primeiro valor informado é maior que o segundo");
            
            
        }else{
            
            System.out.println("O segundo valor infromado é maior que o primeiro");
            
            teclado.close();
            System.exit(0);
        
        
        
        
        
        
    }
}
}