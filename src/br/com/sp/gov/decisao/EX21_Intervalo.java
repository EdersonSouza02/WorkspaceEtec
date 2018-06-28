package br.com.sp.gov.decisao;
import java.util.Scanner;

public class EX21_Intervalo {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Informe um valor");
        int valor1=teclado.nextInt();
        
        if(valor1>=100 && valor1<=200)
            System.out.println("O valor está entre 100 e 200");
        
    else{
    System.out.println("O valor está acima de 200");
    
        teclado.close();
        System.exit(0);
        
    }
    
}
}
