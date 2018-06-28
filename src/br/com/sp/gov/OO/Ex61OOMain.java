
package br.com.sp.gov.OO;

import java.util.Scanner;


public class Ex61OOMain {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a nota do aluno");
        double media=teclado.nextDouble();
        
        Ex61OO.getSituacaoDoAluno(media);
        
        teclado.close();
        System.exit(0);
    }
    
    
}
