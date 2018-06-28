package br.com.sp.gov.OO;

import java.util.Scanner;

public class Ex63OOMain {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o total da compra : ");
        int valor = teclado.nextInt();

        System.out.println("---------------------------------------------------");
        System.out.println("-       FORMA DE PAGAMENTO                        -");
        System.out.println("1 - Venda a Vista - desconto de 10%                ");
        System.out.println("2 - Venda a Prazo 30 dias - desconto de 5%         ");
        System.out.println("3 - Venda a Prazo 60 dias - mesmo preï¿½o            ");
        System.out.println("4 - Venda a Prazo 90 dias - acrï¿½scimo de 5%;       ");
        System.out.println("5 - Venda com cartï¿½o de dÃ©bito - desconto de 8%    ");
        System.out.println("6 - Venda com cartï¿½o de crÃ©dito - desconto de 7%   ");
        System.out.println("----------------------------------------------------");
        System.out.println("Informe a opção");
        int opcao = teclado.nextInt();

        
        Ex63OO.getValorDaCompra(valor, opcao);
        
        
        teclado.close();
        System.exit(0);

    }
}
