package br.com.sp.gov.decisao;
import java.util.Scanner;

public class EX25_Futebol {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        
       System.out.println("Informe seu nome:");
           String nome=teclado.next();
           
           
           System.out.println("Informe a idade:");
           int idade=teclado.nextInt();
           
           if(idade>=5 && idade<=11){
            System.out.println("O nome do jogador é:"+nome+"E sua categoria é infantil");
           }
            
            if(idade>=11 && idade<=15){
                System.out.println("O nome do jogador é:"+nome+"E sua categoria é juvenil");
            
            }
            if (idade>=16 && idade<=20){
                System.out.println("O nome do jogador é:"+nome+"E sua categoria é Junior");
                
                
            }
           
            if(idade>=21 && idade<=25){
                System.out.println("O nome do jogador é:"+nome+"E sua categoria é Professional");
                
            }
            
            else{
                System.out.println("O jogador não pertence a nenhuma das categorias");
                
            }
           
           
           teclado.close();
           System.exit(0);
           
           
   }
}
