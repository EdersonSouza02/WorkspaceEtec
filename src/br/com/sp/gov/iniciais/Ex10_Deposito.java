
package br.com.sp.gov.iniciais;
import java.util.Scanner;

public class Ex10_Deposito {
    public static void main(String[]args){
        
       Scanner teclado=new Scanner(System.in);
        double rendimento,juros;
       
       System.out.println("Informe a quantidade do deposito em reais:");
       double deposito=teclado.nextDouble();
       
       juros=(deposito*7)/100;
       rendimento=deposito+juros;
       
       System.out.println("O rendimento de sua poupança após um mês será de:"+rendimento+"R$");
       
       
        teclado.close();
        System.exit(0);
        
    }
    
    
}
