
package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;


public class MaiorNumero {
    public static void main(String[]args){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o primeiro n�mero");
        int a = teclado.nextInt();
        System.out.println("Informe o segundo valor");
        int b = teclado.nextInt();
        
        if(a>b){
            System.out.println("O 1�� valor � maior que o segundo");
            
        }else{
            System.out.println("O segundo valor � maior que o primeiro");
            
            teclado.close();
            System.exit(0);
        }
        
    }
    
    
}
