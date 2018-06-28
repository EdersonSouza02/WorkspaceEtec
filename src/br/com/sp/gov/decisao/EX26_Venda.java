package br.com.sp.gov.decisao;
import java.util.Scanner;

public class EX26_Venda {
    public static void main(String[]args){
        Scanner teclado=new Scanner (System.in);
        
        System.out.println("Digite o valor da venda");
        double valorvenda=teclado.nextDouble();
        
        
        System.out.println("1 - Venda a Vista - desconto de 10%");
        System.out.println("2 - Venda a Prazo 30 dias - desconto de 5%");
        System.out.println("3 - Venda a Prazo 60 dias - mesmo preço");
        System.out.println("4 - Venda a Prazo 90 dias - acréscimo de 5%");
        System.out.println("5 - Venda com cartão de débito - desconto de 8%");
        System.out.println("6 - Venda com cartão de crédito - desconto de 7%");
        
        
        System.out.println("ESCOLHA UMA FORMA DE PAGAMENTO");
        int pagamento=teclado.nextInt();
        
       
		switch(pagamento){
                
                case 1:
                   valorvenda =(valorvenda*0.10);
                   System.out.println(valorvenda);
                   break;
                   
                case 2:
                    valorvenda=(valorvenda*0.5);
                    System.out.println(valorvenda);
                   break;
                   
                case 3:
                    valorvenda=(valorvenda*1);
                    System.out.println(valorvenda);
                    break;
                    
                    
                case 4:
                    valorvenda=(valorvenda*0.92);
                    System.out.println(valorvenda);
                    break;
                    
                case 5:
                    valorvenda=(valorvenda*0.93); 
                    System.out.println(valorvenda);
                
                case 6:
                    valorvenda=(valorvenda*0.07);
                    System.out.println(valorvenda);
                    
                    
                default:
                    System.out.println("Valor informado inv�lido");
        
    teclado.close();
    System.exit(0);
        
        }
    
}
}
