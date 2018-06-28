package br.com.sp.gov.OO;

import java.util.Scanner;

public class Ex58OOMain {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o salário");
        double salario = 0;
        
        
        Ex58OO.calculaAumentoSalario(salario);
    
        teclado.close();
        System.exit(0);
    
    }
    
}

      
    
    

