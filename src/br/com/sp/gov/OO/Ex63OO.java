package br.com.sp.gov.OO;

import java.util.Scanner;

public class Ex63OO {

    public static void getValorDaCompra(int valor, int opcao) {

        Scanner teclado = new Scanner(System.in);

        double total = 0;
       
        
       
        

        switch (opcao) {

            case 1:
                System.out.println("1 - Venda a Vista - desconto de 10%");

                total = valor - (valor * 0.10);
                System.out.println(total);
                break;

            case 2:
                System.out.println("2 - Venda a Prazo 30 dias - desconto de 5%");
                total = valor - (valor * 0.05);
                System.out.println(total);
                break;
                
            case 3:
                System.out.println("3 - Venda a Prazo 60 dias - mesmo preço");
System.out.println(total);

                break;
            case 4:
                System.out.println("4 - Venda a Prazo 90 dias - acr�scimo de 5%;");

                total = (valor * 0.05) + valor;
                System.out.println(total);
                break;

            case 5:
                System.out.println("5 - Venda com cart�o de d�bito - desconto de 8%");

                total = valor - (valor * 0.08);
                System.out.println(total);
                break;

            case 6:
                System.out.println("6 - Venda com cart�o de cr�dito - desconto de 7%");

                total = valor - (valor * 0.07);
                System.out.println(total);
                break;

            default:
                System.out.println(" Opção invalida !!");
                
                teclado.close();
                System.exit(0);
        }
    }
}
