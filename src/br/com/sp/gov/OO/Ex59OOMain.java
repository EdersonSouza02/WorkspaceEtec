
package br.com.sp.gov.OO;
import java.util.Scanner;

public class Ex59OOMain {
    public static void main(String[]args){
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o código do produto");
        int cod = 0;
        
        Ex59OO.getDescricaoProduto(cod);
        
        teclado.close();
        System.exit(0);
    }
    
    
}
