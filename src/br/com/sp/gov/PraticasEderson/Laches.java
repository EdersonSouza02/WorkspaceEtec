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

        System.out.println("Digite o número do seu lanche: ");
        pedido = teclado.nextInt();

        switch (pedido) {
            case 1:
                System.out.println("Você escolheu Hot dog");
                System.out.println("O pre�o do Hot Dog �: R$ 5");
                break;
            case 2:
                System.out.println("Você escolheu X-Salada");
                System.out.println("O pre�o do X-Salada �: R$ 15");
                break;
            case 3:
                System.out.println("Você escolheu X-Picanha");
                System.out.println("O pre�o do X-Picanha �: R$ 22");
                break;
            case 4:
                System.out.println("Você escolheu X-Tudo");
                System.out.println("O pre�o do X-Tudo �: R$ 30");
                break;
            default:
                System.out.println("Op��o inv�lida");
                break;
        }
        teclado.close();
    }

}
