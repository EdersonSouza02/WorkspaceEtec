package br.com.sp.gov.iniciais;
import java.util.Scanner;

public class Ex12_Valordevenda {
    public static void main(String[]args){
        
       double valor,valorfinal;
       
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe o valor do produto em R$:");
        double valprod=teclado.nextDouble();
        
        System.out.println("Informe o percentual que deseja receber em %");
        double porcentagem=teclado.nextDouble();
        
        valor=(valprod*porcentagem)/100;
        valorfinal=valor+valprod;
        
        System.out.println("O valor de venda do seu produto será:"+valorfinal+"R$");
        
        
        teclado.close();
        System.exit(0);
        
    }
    
    
    
}
