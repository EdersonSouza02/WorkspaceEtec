
package br.com.sp.gov.iniciais;
import java.util.Scanner;

public class Ex09_Converter {
    public static void main(String[]args){
        
        Scanner teclado=new Scanner(System.in);
        
        double rs;
        
        System.out.println("Informe a quantidade de dolar que deseja converter");
        double dolar=teclado.nextDouble();
        System.out.println("Qual a cota��o?");
        double cot=teclado.nextDouble();
        
        rs=dolar*cot;
        
        System.out.println("Seu valor em real ser�:"+rs+"R$");
        
        teclado.close();
        System.exit(0);
        
        
    }
    
    
}
