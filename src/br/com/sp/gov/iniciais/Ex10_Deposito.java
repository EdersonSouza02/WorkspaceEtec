
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
       
       System.out.println("O rendimento de sua poupan�a ap�s um m�s ser� de:"+rendimento+"R$");
       
       
        teclado.close();
        System.exit(0);
        
    }
    
    
}
