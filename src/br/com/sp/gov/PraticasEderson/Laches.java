package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class Laches {

    public static void main(String[] args) {

        int pedido;
        Scanner teclado = new Scanner(System.in);

        System.out.println("==========Escolha seu lanche ==========");
        System.out.println("Menu de lanches: ");
        System.out.println("1 - Hot Dog");
        System.out.println("2 - X-Salada");
        System.out.println("3 - X-Picanha");
        System.out.println("4 - X-Tudo");

        System.out.println("Digite o nÃºmero do seu lanche: ");
        pedido = teclado.nextInt();

        switch (pedido) {
            case 1:
                System.out.println("VocÃª escolheu Hot dog");
                System.out.println("O preço do Hot Dog é: R$ 5");
                break;
            case 2:
                System.out.println("VocÃª escolheu X-Salada");
                System.out.println("O preço do X-Salada é: R$ 15");
                break;
            case 3:
                System.out.println("VocÃª escolheu X-Picanha");
                System.out.println("O preço do X-Picanha é: R$ 22");
                break;
            case 4:
                System.out.println("VocÃª escolheu X-Tudo");
                System.out.println("O preço do X-Tudo é: R$ 30");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        teclado.close();
    }

}
